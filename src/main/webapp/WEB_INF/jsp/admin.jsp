<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>



<head>
<meta charset="UTF-8">
<title>Insert title here</title>



</head>
<body>


<div id = "root">


WELCOME ${user.name} 

<div id = "addUser">
<br><br>
<form name = "addManiac" action = "/addManiac">

Name:     <input type = "text" name = "name"/><br>
Username: <input type = "text" name = "userid"/><br>
Password: <input type = "password" name = "password"/><br>
Member type:  
<input type = "radio" name = "isAdmin" value = "true"/>Admin
<input type = "radio" name = "isAdmin" value = "false"/>Manaic
<br>
<input type = "submit" value = "ADD">


</form>

</div>


<div class = "updateScores" >

<h2>Update Player Scores</h2>
<form name = "teamname" action = "/team" method = "Post">
<select name="teamname">
	
	<option value="AFGHANISTAN">AFGHANISTAN</option>
	<option value="AUSTRALIA">AUSTRALIA</option>
	<option value="BANGLADESH">BANGLADESH</option>
	<option value="ENGLAND">ENGLAND</option>
	<option value="INDIA" >INDIA</option>
	<option value="NEWZELAND">NEWZELAND</option>
	<option value="PAKISTAN">PAKISTAN</option>
	<option value="SOUTHAFRICA">SOUTHAFRICA</option>
	<option value="SRILANKA">SRILANKA</option>
	<option value="WESTINDIES">WESTINDIES</option>
</select>
<input type = "submit" value = "Fetch players">
</form>

</div>
<div id = "update">


	
  

	<!-- <form name ="score" onsubmit="redirect(this)">
	 Name : <input type = "text" name = "name"/><br>
	<input type = "submit" value = "Update now">
    </form>
     -->
    
	<c:forEach items="${team}" var="player">
	<form name = "updateScore" action = "./WEB_INF/jsp/score.jsp">
	<table>
	<tr>
	<td><c:out value="${player.playername}" /></td>
	<td><c:out value="${player.playerrole}" /> </td>
	
	<td><input type = "submit" value = "update"></td>
	</tr>
    </table>
    <input type = "hidden" name ="playerName" value = "${player.playername}" />
    <input type = "hidden" name ="playerRole" value = "${player.playerrole}" />
    <input type = "hidden" name ="captain" value = "${player.iscaptain}" />
    </form>
    </c:forEach>





</div>




 </div>
</body>
</html>