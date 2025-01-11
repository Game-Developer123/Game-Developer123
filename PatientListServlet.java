import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class PatientListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("doctorId") == null) {
            // Redirect to login if not logged in
            response.sendRedirect("login.jsp");
            return;
        }

        try (Connection conn = DatabaseUtil.getConnection();
             Statement stmt = conn.createStatement()) {

            // Get all patients from the database
            ResultSet rs = stmt.executeQuery("SELECT * FROM patients");

            // Map the result set to a list of Patient objects
            List<Patient> patients = DatabaseUtil.executeQuery(rs, new ArrayList<>(), new ResultSetMapper<Patient>() {
                @Override
                public Patient mapRow(ResultSet rs) throws SQLException {
                    Patient patient = new Patient();
                    patient.setId(rs.getInt("id"));
                    patient.setName(rs.getString("name"));
                    patient.setAge(rs.getInt("age"));
                    patient.setGender(rs.getString("gender"));
                    patient.setDiagnosis(rs.getString("diagnosis"));
                    patient.setRemarks(rs.getString("remarks"));
                    return patient;
                }
            });

            // Set the list of patients as a request attribute
            request.setAttribute("patients", patients);

            // Forward the request to the patient_list.jsp page
            RequestDispatcher dispatcher = request.getRequestDispatcher("patient_list.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp"); // Redirect to an error page if an exception occurs
        }
    }
}
