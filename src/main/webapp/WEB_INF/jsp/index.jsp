<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Cricket - Maniac</title>
</head>
<body>
<div class = "root">
<h2 align = "center"> Welcome to my page </h2>

<h2 align = "center" yalign = "center"> Please enter your credentials to sign in </h2>

<form align = "center" action ="/authenticate" method = "Post">
<label>Username :  </label>
<input type = "text" id = "userid" name = "userid"/>

<label>Password :  </label>
<input type = "text" id = "userid" name = "password"/>


<input type = "submit" id = "userid"/>
</form>



</div>


</body>
</html>