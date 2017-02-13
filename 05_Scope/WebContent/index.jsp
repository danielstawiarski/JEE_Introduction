<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login into chat:</title>
</head>
<body>
<!-- <form action= "LoginServletApplicationScope" method= "post">
<form action="LoginServletRequestScope" method= "post">
<form action="LoginServletSessionScope" method= "post">  

The same change for JSP sites.  -->
<form action="chatRequestScope.jsp" method= "post">
   <input type="text" name="login" >
   <input type="submit" value="Zaloguj!" >
</form>
</body>
</html>