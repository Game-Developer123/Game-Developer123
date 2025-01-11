<!DOCTYPE html>
<html>
<head>
    <title>Add Patient</title>
</head>
<body>
    <h1>Add Patient</h1>
    <form action="AddPatientServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>
        <label for="gender">Gender:</label>
        <input type="text" id="gender" name="gender" required><br><br>
        <label for="diagnosis">Diagnosis:</label>
        <textarea id="diagnosis" name="diagnosis"></textarea><br><br>
        <label for="remarks">Remarks:</label>
        <textarea id="remarks" name="remarks"></textarea><br><br>
        <button type="submit">Add Patient</button>
    </form>
</body>
</html>
