<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id = "score">
Player name: <%=request.getParameter("playerName") %>
Player role: <%=request.getParameter("playerRole") %>
Captain ? : <%=request.getParameter("captain") %>




<form name = "score" action = "/scoreUpdate" method = "Post">
 <input type = "hidden" name ="playername" value = "<%=request.getParameter("playerName") %>"/>
 <input type = "hidden" name ="playerrole" value = "<%=request.getParameter("playerRole") %> "/>
 <input type = "hidden" name ="captain" value = "<%=request.getParameter ("captain") %>" />
 <input type = "hidden" name ="isWk" value = "<%=request.getParameter ("captain") %>" />

<fieldset>
<legend> Batting details</legend>
Runs : <input type = "text" name = "runs"/> <br>
Balls: <input type = "text" name = "balls"/> <br>
OUT/ Not-out: 
<input type = "radio" name = "isNotOut" value = "true"/> Not out
<input type = "radio" name = "isNotOut" value = "false"/>Out
</fieldset>

<fieldset>
<legend> Bowling details</legend>
Wick: <input type = "text" name = "wickets"/><br>
Economy: <input type = "text" name = "economy"/><br>

</fieldset>

<fieldset>
<legend> Fielding details</legend>
Catches: <input type = "text" name = "catches"/><br>
Direct hits: <input type = "text" name = "directhits"/><br>
</fieldset>

<br>
<input type = "submit"> 
</form>
</div>

</body>
</html>


