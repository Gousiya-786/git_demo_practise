<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   
    pageEncoding="ISO-8859-1"
    import= "com.wipro.servlets.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
</head>
<body>

<jsp:useBean id="u" class="com.wipro.servlets.User"/>
<jsp:setProperty property="name" name="u" value="Sofiya"/>
<jsp:setProperty property="age" name="u" value="24"/>
<p>User name:<jsp:getProperty property="name" name="u" /></p>
<p>User age:<jsp:getProperty property="age" name="u" /></p>

</body>
</html>