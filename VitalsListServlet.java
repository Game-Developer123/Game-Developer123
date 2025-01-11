import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VitalsListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int patientId = Integer.parseInt(request.getParameter("patientId"));
        List<Vital> vitals = new ArrayList<>();

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM vitals WHERE patient_id=?")) {
            stmt.setInt(1, patientId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Vital vital = new Vital();
                vital.setId(rs.getInt("id"));
                vital.setBpHigh(rs.getDouble("bp_high"));
                // ... other fields
                vitals.add(vital);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("vitals", vitals);
        request.getRequestDispatcher("vitals_list.jsp").forward(request, response);
    }
}
