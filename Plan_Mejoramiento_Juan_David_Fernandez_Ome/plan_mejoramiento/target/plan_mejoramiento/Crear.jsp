<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crear Cuenta</title>
    <link rel="stylesheet" href="./assets/CSS/Style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com"><link rel="preconnect" href="https://fonts.gstatic.com" crossorigin><link href="https://fonts.googleapis.com/css2?family=Sedgwick+Ave+Display&display=swap" rel="stylesheet">
    <link rel="shortcut icon" href="./assets/IMAGENES/balon-de-futbol.png">
</head>
<body>
    <div>
        <h3 align="center">CREAR UNA CUENTA</h3>
        <hr>
        <br>
        <h2 align="center">Por favor llenar todos los campos:</h2>
        <section align="center">
        <input class="controls" type="text" name="Nombre"
        <input class="controls" type="text" name="Correo"
        required placeholder="Ingrese su Correo" 
        autofocus pattern="[A-Za-z0-9"> 
        <br>
        <input  class="controls" type="text" name="Contraseña"
        required placeholder="Ingrese su Contraseña" 
        autofocus pattern="[A-Za-z0-9"> 
        <input class="botons" type="submit"value="GUARDAR">
        <p>Volver al <a href="index.jsp">Inicio de sesion</a></p>
        </section>
        </div>
</body>
</html>