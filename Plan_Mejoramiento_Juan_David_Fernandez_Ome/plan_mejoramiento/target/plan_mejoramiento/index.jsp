<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <link rel="stylesheet" href="./assets/CSS/Style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><link href="https://fonts.googleapis.com/css2?family=Sedgwick+Ave+Display&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="./assets/IMAGENES/balon-de-futbol.png">
</head>
<body>
    <div id="form">
    <h3 align="center">INICIAR SESION</h3>
    <hr>
    <br>
    <section align="center">
    <input class="controls" type="text" name="Correo" id="username" 
    required placeholder="Ingrese su correo"> 
    <input  class="controls" type="password" name="Contraseña" id="password" 
    required placeholder="Ingrese su contraseña"> 
    <p><a href="juego.jsp">Ingrese sin registrarse</a></p>
    <input class="botons" type="submit" value="Ingresar" id="button">
    <p><a href="Crear.jsp">Crear una Cuenta</a></p>
    </section>
    </div>
</body>
</html>