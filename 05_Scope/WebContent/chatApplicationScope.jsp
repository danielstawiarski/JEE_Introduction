<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%! String login; %>
<%
    login = request.getParameter("login");
    if(application.getAttribute("login") == null)
        application.setAttribute("login", login);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Witaj <%= application.getAttribute("login") %></title>
</head>
<body>
    <h1>Witaj <%= application.getAttribute("login") %></h1>
</body>
</html>