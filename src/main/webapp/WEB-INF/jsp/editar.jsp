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
                    <h4>Actualizar Registro</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombre</label>
                        <input type="text" name="nom" class="form-control" value="${lista[0].Nombre}">
                        <br>
                        <label>Cargo</label>
                        <select name="cargo">
                            <option>Albergue de Pinguinos</option>
                            <option>Kyboko Nyumba</option>
                            <option>Expedicion Tiburones</option>
                            <option>Bahia de Lobos</option>
                            <option>Paseo en Tren</option>
                            <option>Refugio del Mar</option>
                        </select>
                        <br>
                        <br>
                        <label>Fecha de Ingreso</label>
                        <input type="date" name="fechain" class="form-control" value="${lista[0].Fechain}"><br>
                        <input type="submit" value="Editar" class="btn btn-success">
                        <a href="index.htm" class="btn btn-warning">Regresar</a>
                    </form>   
                </div>
            </div>
        </div>
    </body>
</html>
