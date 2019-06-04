<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>



<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <!-- font awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp"
          crossorigin="anonymous">
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/css/materialize.min.css">

    <title>Cricket - Maniac</title>


</head>
<body>
<div class="container">



<header>
    <nav class="nav-wraper deep-orange lighten-1 z-depth-5">



            <a href="#" class="brand-logo left"><img  id="logo" src="./WEB_INF/img/logo5.png" width="60" height="auto"/></a>

        <a href="#" class="brand-logo center">Cricket Maniacs</a>
        <ul class="right">
                <li><a href="/scores" class="white-text darken-4">Scores</a></li>

            </ul>


    </nav>

</header>


<div class = row>

<div class="col s12 grey lighten-1">
<table class="striped centered">
	


    <thead>
    <tr>
        <th>Player Name</th>
        <th>Runs</th>
        <th>Balls</th>
        <th>Strike rate</th>
        <th>Not out ?</th>
        <th>Total Batting Points</th>
        <th>Wickets</th>
        <th>Economy</th>
        <th>Total Bowling points</th>
        <th>Catches/ Stumpings</th>
        <th>Direct hits</th>
        <th>Total Fielding points</th>
        <th>Total MATCH points</th>
        
    </tr>
    </thead>

    <tbody>
	<c:forEach items="${scoreList}" var="score">

	
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
		


	</c:forEach>

      
    </tbody>
</table>
</div>
</div>


<%-- <div id = "root" align="center">


	<c:forEach items="${scoreList}" var="score">

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

</div> --%>
</div>
</body>
</html>