<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html>
<head>
    <title>Current Date and Time</title>
</head>
<body>
    <h2>Current Date and Time</h2>

    <%
        Date now = new Date();
    %>
    <p>The current date and time is: <%= now.toString() %></p>

    <%
        // Get the current date and time using LocalDateTime
        LocalDateTime nowLocal = LocalDateTime.now();

         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedNow = nowLocal.format(formatter);
    %>
    <p>The current date and time is: <%= formattedNow %></p>

</body>
</html>
