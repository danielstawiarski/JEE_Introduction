<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Operacja wykonana pomyślnie</title>
</head>
<body>
    <h1><%= request.getAttribute("message") %></h1>
    <a href="index.jsp">Homepage</a>
</body>
</html>