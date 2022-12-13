<%-- 
    Document   : agregar
    Created on : 7/12/2022, 05:31:05 PM
    Author     : Jonatan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <title>EDITAR</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>INICIAR SESION</h4>
                </div>
                <form method="POST">
                    <div class="card-body">
                        <label>Nombre:</label>
                        <input class="form-control" type="text" name="txtnombre" placeholder="Ingrese usuario">             
                        <label>Contraseña:</label>
                        <input class="form-control" type="password" name="txtclave" placeholder="Ingrese Contraseña"><br>
                        <input class="btn btn-success" type="submit" value="ingresar" name="accion">
                        <a class="btn btn-warning" href="principal.htm">Atras</a>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
