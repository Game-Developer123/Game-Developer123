<%@ page import="java.util.List" %>
<%@ page import="com.example.healthlogger.model.Patient" %>

<!DOCTYPE html>
<html>
<head>
    <title>Threshold Alerts</title>
</head>
<body>
    <h1>Threshold Alerts</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Diagnosis</th>
                <th>Remarks</th>
            </tr>
        </thead>
        <tbody>
        <%
            List<Patient> patientsWithAlerts = (List<Patient>) request.getAttribute("patientsWithAlerts");
            for (Patient patient : patientsWithAlerts) {
        %>
            <tr>
                <td><%= patient.getId() %></td>
                <td><%= patient.getName() %></td>
                <td><%= patient.getAge() %></td>
                <td><%= patient.getGender() %></td>
                <td><%= patient.getDiagnosis() %></td>
                <td><%= patient.getRemarks() %></td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
</body>
</html>
