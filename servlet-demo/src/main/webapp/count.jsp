<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Visitor Counter</h2>
    <p>This page has been visited <%= request.getAttribute("visitCount") %> times.</p>
</body>
</html>