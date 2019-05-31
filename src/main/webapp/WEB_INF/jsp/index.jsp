<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Cricket - Maniac</title>
</head>
<body>
<div class = "root" align="center">
<h2 align = "center"> Welcome to my page </h2>

<h2 align = "center" > Please enter your credentials to sign in </h2>

<form  action ="/authenticate" method = "Post">
<label>User-name :  </label>
<input type = "text" id = "userid" name = "userid"/>

<label>Password :  </label>
<input type = "password" id = "password" name = "password"/>

<br> <br>
<input type = "submit" value = "Login"/>
</form>



</div>


</body>
</html>