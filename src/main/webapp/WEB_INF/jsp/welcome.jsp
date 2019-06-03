<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>



<html>
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
    <style>
        .col.s6{
            min-height: 40vh;
        }
    </style>

</head>
<body>
<div class="container">

<%--<c:set var="playerName" scope="session" value="${maniac.team[0].playername}"/>  --%>
<%--<c:set var="user" scope="session" value="${user}"/> --%>
<%--<c:if test="${playerName == null}">  --%>
<%--   <jsp:forward page="selectSquad.jsp" >--%>
<%--   	<jsp:param name="userid" value="${user}" />  --%>
<%--   </jsp:forward>    --%>
<%--</c:if> --%>
<header>
    <nav class="nav-wraper deep-orange lighten-1 z-depth-5">



            <a href="#" class="brand-logo left"><img  id="logo" src="./WEB_INF/img/logo5.png" width="60" height="64"/></a>

        <a href="" class="brand-logo center white-text darken-4">Cricket Maniacs</a>
        <ul class="right">
                <li><a href="./WEB_INF/jsp/scores.jsp" class="white-text darken-4">Scores</a></li>

            </ul>


    </nav>

</header>






    <div class="row ">

        <div id = "container">

        <div class="col s6">
            <h4>Aao Bhosdikey ${user.name}</h4>
            <div class="row">
                <div class="col s12 m6">
                    <div class="card blue-grey darken-1">
                        <div class="card-content white-text">
                            <span class="card-title">Your Current Score</span>
                            <blockquote> <h3>${maniac.total_score}</h3></blockquote>
                        </div>
                    </div>
                </div>
            </div>





<table class="striped responsive-table">
	

    <thead>
    <tr>
        <th>Maniac Name</th>
        <th>Maniac Score</th>
    </tr>
    </thead>

    <tbody>
	<c:forEach items="${friends}" var="maniac">
        <tr>
            <td> <c:out value="${maniac.maniac_name}"/></td>
            <td>  <c:out value="${maniac.total_score}"/></td>
         
        </tr>
    </tbody>
    </c:forEach>
    </table>
        </div>

<div class="col s6 grey lighten-1">
<table class="responsive-table striped">
	


    <thead>
    <tr>
        <th>Player Name</th>
        <th>Player Role</th>
        <th>Player Score</th>
        <th>Player Country</th>
    </tr>
    </thead>

    <tbody>
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
    </tbody>
</table>
</div>
    </div>
</div>



</div>
</body>
</html>