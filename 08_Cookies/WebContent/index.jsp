<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome site!</title>
</head>
<body>
<h1>Welcome!</h1>
<!-- Depending on cookie paramater, define specific operation on cookies.-->

<a href="CookieServlet?cookie=create">Create new cookie!</a>
<br>
<a href="CookieServlet?cookie=show">Show cookies!</a>
<br>
<a href="CookieServlet?cookie=remove">Remove all cookies!</a>
<br>
</body>
</html>