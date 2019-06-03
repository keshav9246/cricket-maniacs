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



<div id = "root" align="center">


	<c:forEach items="${scores}" var="score">

		<table align="center" border="2">
			<tr>
				<td><c:out value="${score.player_name}" /></td>
				<td><c:out value="${score.runs}" /> </td>
				<td><c:out value="${score.balls}" /> </td>
				<td><c:out value="${score.strike_rate}" /> </td>
				<td><c:out value="${score.is_notout}" /> </td>
				<td><c:out value="${score.batting_points}" /> </td>
				<td><c:out value="${score.wickets}" /> </td>
				<td><c:out value="${score.economy}" /> </td>
				<td><c:out value="${score.bowling_points}" /> </td>
				<td><c:out value="${score.catches}" /> </td>
				<td><c:out value="${score.direct_hit}" /> </td>
				<td><c:out value="${score.fielding_points}" /> </td>
				<td><c:out value="${score.total_match_score}" /> </td>
			</tr>
		</table>


	</c:forEach>


</body>
</html>