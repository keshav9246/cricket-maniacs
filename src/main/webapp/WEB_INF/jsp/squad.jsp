<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id = "root">
<h2> ${team[0].playername} </h2>
<h2> ${team[1].playername} </h2>





<table border = "3" align = "left"> 
	

		<tr> 
		 <td> Player Name </td>
		  <td> Player Role</td>
		</tr>

	<c:forEach items="${.team}" var="player">
        <tr>
            <td> <c:out value="${player.playername}"/></td>
            <td>  <c:out value="${player.playerrole}"/></td>
              
        </tr>
    </c:forEach>
    
    
  

</table>



</div>

</body>
</html>