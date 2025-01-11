import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VitalsGraphServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        int patientId = Integer.parseInt(request.getParameter("patientId"));
        List<Vital> vitals = new ArrayList<>();

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM vitals WHERE patient_id=?")) {
            stmt.setInt(1, patientId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vital vital = new Vital();
                vital.setRecordedAt(rs.getTimestamp("recorded_at"));
                vital.setBpHigh(rs.getDouble("bp_high"));
                // ... other fields
                vitals.add(vital);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        out.println(generateChartData(vitals));
    }

    private String generateChartData(List<Vital> vitals) {
        StringBuilder json = new StringBuilder();
        json.append("{");
        json.append("\"labels\": [");
        for (Vital vital : vitals) {
            json.append("\"").append(vital.getRecordedAt().toString()).append("\",");
        }
        json.deleteCharAt(json.lastIndexOf(",")); // Remove trailing comma
        json.append("],");

        json.append("\"datasets\": [");
        json.append("{");
        json.append("\"label\": \"BP High\",");
        json.append("\"data\": [");
        for (Vital vital : vitals) {
            json.append(vital.getBpHigh()).append(",");
        }
        json.deleteCharAt(json.lastIndexOf(","));
        json.append("],");
        json.append("\"borderColor\": \"rgba(255, 99, 132, 1)\",");
        json.append("\"borderWidth\": 1");
        json.append("}");
        json.append("]");

        json.append("}");
        return json.toString();
    }
}
