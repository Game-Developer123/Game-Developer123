<%@ page import="com.example.healthlogger.model.Patient" %>

<!DOCTYPE html>
<html>
<head>
    <title>Patient Details</title>
</head>
<body>
    <h1>Patient Details</h1>
    <%
        Patient patient = (Patient) request.getAttribute("patient");
    %>
    <p>ID: <%= patient.getId() %></p>
    <p>Name: <%= patient.getName() %></p>
    <p>Age: <%= patient.getAge() %></p>
    <p>Gender: <%= patient.getGender() %></p>
    <p>Diagnosis: <%= patient.getDiagnosis() %></p>
    <p>Remarks: <%= patient.getRemarks() %></p>
    <a href="vitals_list?patientId=<%= patient.getId() %>">View Vitals</a>
</body>
</html>
