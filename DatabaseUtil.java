import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/health_logger";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("Error loading JDBC driver");
        }
        return conn;
    }

    public static int executeUpdate(String sql, List<Object> params) throws SQLException {
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            int index = 1;
            for (Object param : params) {
                if (param instanceof Integer) {
                    stmt.setInt(index, (Integer) param);
                } else if (param instanceof Double) {
                    stmt.setDouble(index, (Double) param);
                } else if (param instanceof String) {
                    stmt.setString(index, (String) param);
                } else if (param instanceof Date) {
                    stmt.setDate(index, (Date) param);
                } else if (param instanceof Timestamp) {
                    stmt.setTimestamp(index, (Timestamp) param);
                } else {
                    throw new IllegalArgumentException("Unsupported data type: " + param.getClass().getSimpleName());
                }
                index++;
            }
            return stmt.executeUpdate();
        }
    }

    public static <T> List<T> executeQuery(String sql, List<Object> params, ResultSetMapper<T> mapper) throws SQLException {
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            int index = 1;
            for (Object param : params) {
                if (param instanceof Integer) {
                    stmt.setInt(index, (Integer) param);
                } else if (param instanceof Double) {
                    stmt.setDouble(index, (Double) param);
                } else if (param instanceof String) {
                    stmt.setString(index, (String) param);
                } else if (param instanceof Date) {
                    stmt.setDate(index, (Date) param);
                } else if (param instanceof Timestamp) {
                    stmt.setTimestamp(index, (Timestamp) param);
                } else {
                    throw new IllegalArgumentException("Unsupported data type: " + param.getClass().getSimpleName());
                }
                index++;
            }
            ResultSet rs = stmt.executeQuery();
            List<T> results = new ArrayList<>();
            while (rs.next()) {
                results.add(mapper.mapRow(rs));
            }
            return results;
        }
    }

    public interface ResultSetMapper<T> {
        T mapRow(ResultSet rs) throws SQLException;
    }
}
