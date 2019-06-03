<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
        min-height: 65vh;
    }


</style>


    <div class="container">
        <nav class="nav-wraper">
            <div class="container">

                <a href="" class="brand-logo black-text darken-4">Cricket Maniacs</a>
            </div>
        </nav>
    </div>
</head>
<body>



<div class="container">

    <div class="row">
        <div class="col s6 teal lighten-2 ">

            <img src="./img/logo.png" alt="" class="responsive-img materialboxed">

        </div>


        <div class="col s6 orange lighten-2" >
            <form  action ="/authenticate" method = "Post">

                <div class="input-field">
                    <input type="text" id="userid" name = "userid">
                    <label for="userid">Your User ID</label>
                </div>

                <div class="input-field">
                    <input type="password" id="password" name = "password"/>
                    <label for="password">Your Password</label>
                </div>

                <div class="input-field center">
                    <input class="btn" type = "submit" value = "Login"/>
                </div>
            </form>



        </div>
    </div>
    <footer class="page-footer grey darken-3">
        <div class="container">
            <div class="row">
                <div class="col l6 s12">
                    <h5>About Me</h5>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum at lacus congue.</p>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum at lacus congue, suscipit elit nec, tincidunt orci.</p>
                </div>
                <div class="col l4 offset-l2 s12">
                    <h5 class="white-text">Connect</h5>
                    <ul>
                        <li><a class="grey-text text-lighten-3" href="#">Facebook</a></li>
                        <li><a class="grey-text text-lighten-3" href="#">Twitter</a></li>
                        <li><a class="grey-text text-lighten-3" href="#">Linked In</a></li>
                        <li><a class="grey-text text-lighten-3" href="#">Instagram</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="footer-copyright grey darken-4">
            <div class="container center-align">&copy; 2018 Photo Ninja</div>
        </div>
    </footer>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-beta/js/materialize.min.js"></script>


</body>
</html>