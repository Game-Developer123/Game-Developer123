<%@ page import="java.util.List" %>
<%@ page import="com.example.healthlogger.model.Vital" %>

<!DOCTYPE html>
<html>
<head>
    <title>Vitals List</title>
</head>
<body>
    <h1>Vitals List</h1>
    <table>
        <thead>
            <tr>
                <th>Recorded At</th>
                <th>BP High</th>
                <th>BP Low</th>
                <th>Saturation</th>
                <th>SpO2</th>
            </tr>
        </thead>
        <tbody>
        <%
            List<Vital> vitals = (List<Vital>) request.getAttribute("vitals");
            for (Vital vital : vitals) {
        %>
            <tr>
                <td><%= vital.getRecordedAt() %></td>
                <td><%= vital.getBpHigh() %></td>
                <td><%= vital.getBpLow() %></td>
                <td><%= vital.getSaturation() %></td>
                <td><%= vital.getSpO2() %></td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
    <a href="vitals_graph?patientId=<%= request.getParameter("patientId") %>">View Graph</a>
</body>
</html>
