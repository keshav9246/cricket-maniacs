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

<%--<c:set var="playerName" scope="session" value="${maniac.team[0].playername}"/>  --%>
<%--<c:set var="user" scope="session" value="${user}"/> --%>
<%--<c:if test="${playerName == null}">  --%>
<%--   <jsp:forward page="selectSquad.jsp" >--%>
<%--   	<jsp:param name="userid" value="${user}" />  --%>
<%--   </jsp:forward>    --%>
<%--</c:if> --%>

<div id = "root">
WELCOME ${user.name} 
<br><br> <br> <br> <br>

    <a href = "./WEB_INF/jsp/scores.jsp" >SCORES</a>



<table border = "3" align = "left"> 
	<tr> 
	<td>Your Current Score </td> 
	<td><h2>${maniac.total_score}</h2> </td></tr>

</table>


<table border = "3" align = "center"> 
	

<tr> 
 <td> Maniac Name </td>
   <td> Maniac Score</td>
   
</tr>
	<c:forEach items="${friends}" var="maniac">
        <tr>
            <td> <c:out value="${maniac.maniac_name}"/></td>
            <td>  <c:out value="${maniac.total_score}"/></td>
         
        </tr>
        
        
        
    </c:forEach>
    </table>


<table border = "3" align = "right"> 
	

<tr> 
 <td> Player Name </td>
  <td> Player Role</td>
   <td> Player Score</td>
    <td> Player Country </td>
</tr>
	<c:forEach items="${maniac.team}" var="player">
        <tr>
            <td> <c:out value="${player.playername}"/></td>
            <td>  <c:out value="${player.playerrole}"/></td>
            <td>  <c:out value="${player.playerscore}"/></td>
            <td>  <c:out value="${player.teamname}"/></td>    
        </tr>
        
        
        
    </c:forEach>
    
   
      <tr>
            <td> Orange Cap</td>
            <td colspan="3"> <c:out value="${maniac.orange_cap}"/> </td>
      </tr>
            <tr>
            <td>  Purple Cap</td>
            <td colspan="3">  <c:out value="${maniac.purple_cap}"/></td>    
        </tr>
</table>
</div>




</body>
</html>