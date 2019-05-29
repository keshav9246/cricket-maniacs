<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>


<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>



<body>

<div id = "score">

<form name = "score">


Runs : <input type = "text" name = "runs"/>
Balls: <input type = "text" name = "balls"/>
OUT/ Not-out: <input type = "radio" name = "isNotOut" value = "true"/> Not out
<input type = "radio" name = "isNotOut" value = "false"/>Out


Wick: <input type = "text" name = "wickets"/>
Economy: <input type = "text" name = "economy"/>


<input type = "text" name = "catches"/>
<input type = "text" name = "direct-hit"/>


<input type = "submit" value = "Save">  
</form>
</div>

</body>
</html>