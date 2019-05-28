<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>


<html>

<script type="text/javascript">
function submitForm() {
    document.getElementById("teamname").submit();
}

function addPlayer()
{
	document.getE
}


</script>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>
<div id = "root">

WELCOME ${user.name} 

<form id = "teamname" name = "teamname" action = "/team" method = "Post">
<table> 

<tr> 

<td>
<input type = "checkbox" name = "teamname" value = "INDIA" onclick="submitForm()"/>INDIA 
</td>

<td>
<input type = "checkbox" name = "teamname" value = "AUSTRALIA" onclick="submitForm()"/>AUSTRALIA 
</td>

<td>
<input type = "checkbox" name = "teamname" value = "PAKISTAN" onclick="submitForm()"/>PAKISTAN 
</td>

<td>
<input type = "radio" name = "teamname" value = "SOUTHAFRICA" onclick="submitForm()"/>SOUTHAFRICA 
</td>

<td>
<input type = "radio" name = "teamname" value = "AFGHANISTAN" onclick="submitForm()"/>AFGHANISTAN 
</td>

<td>
<input type = "radio" name = "teamname" value = "ENGLAND" onchange="submitForm()"/>ENGLAND 
</td>

<td>
<input type = "radio" name = "teamname" value = "NEWZELAND" onchange="submitForm()"/>NEWZELAND 
</td>

<td>
<input type = "radio" name = "teamname" value = "BANGLADESH" onchange="submitForm()"/>BANGLADESH 
</td>

<td>
<input type = "radio" name = "teamname" value = "SRILANKA" onchange="submitForm()"/>SRILANKA 
</td>

<td>
<input type = "radio" name = "teamname" value = "WESTINDIES" onchange="submitForm()"/>WESTINDIES 
</td>

<td>
</td>

</tr>

</table>



<form name = "team" action = "/submitTeam" method = "Post">

<input type = "hidden" name = "maniacName" value = ${user.name}>
<table>
	<c:forEach items="${team}" var="player">
	
	<tr>
	
	<td><input type = "checkbox" name = ""></td> 
	<td><c:out value="${player.playername}" /> </td>
	<td><c:out value="${player.playerrole}" /> </td>
	</tr>
       
    </c:forEach>
    </table>
	</form>

</form>





</div>
</body>
</html>