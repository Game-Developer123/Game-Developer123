<%@ page import="java.util.List" %>
<%@ page import="com.example.healthlogger.model.Patient" %>

<!DOCTYPE html>
<html>
<head>
    <title>Patient List</title>
</head>
<body>
    <h1>Patient List</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Diagnosis</th>
                <th>Remarks</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
        <%
            List<Patient> patients = (List<Patient>) request.getAttribute("patients");
            for (Patient patient : patients) {
        %>
            <tr>
                <td><%= patient.getId() %></td>
                <td><%= patient.getName() %></td>
                <td><%= patient.getAge() %></td>
                <td><%= patient.getGender() %></td>
                <td><%= patient.getDiagnosis() %></td>
                <td><%= patient.getRemarks() %></td>
                <td>
                    <a href="patient_details?id=<%= patient.getId() %>">View Details</a>
                    <a href="edit_patient?id=<%= patient.getId() %>">Edit</a>
                    <a href="delete_patient?id=<%= patient.getId() %>">Delete</a>
                </td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
</body>
</html>
