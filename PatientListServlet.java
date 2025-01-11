import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Patient> patients = new ArrayList<>();

        try (Connection conn = DatabaseUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM patients")) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Patient patient = new Patient();
                patient.setId(rs.getInt("id"));
                patient.setName(rs.getString("name"));
                // ... other fields
                patients.add(patient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("patients", patients);
        request.getRequestDispatcher("patient_list.jsp").forward(request, response);
    }
}
