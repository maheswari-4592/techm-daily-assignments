<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.servlets.StudentEntity" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
    <h2>Student Information</h2>
    <%
        StudentEntity student = (StudentEntity) request.getAttribute("student");
        if (student != null) {
    %>
        <p>Name: <%= student.getName() %></p>
        <p>Age: <%= student.getAge() %></p>
        <p>Grade: <%= student.getGrade() %></p>
    <%
        } else {
    %>
        <p>No student information available.</p>
    <%
        }
    %>
</body>
</html>
