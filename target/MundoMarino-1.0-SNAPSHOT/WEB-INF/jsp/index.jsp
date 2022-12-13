<%-- 
    Document   : index
    Created on : 7/12/2022, 03:10:54 PM
    Author     : Jonatan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <title>CRUD</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-primary" href="agregar.htm">Nuevo registro</a> 
                    <a class="btn btn-primary" href="principal.htm">Cerrar Sesion</a> 
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>NOMBRE</th>
                                    <th>CARGO</th>
                                    <th>FECHA-INGRESO</th>
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="dato" items="${lista}">
                                <tr>
                                    <td>${dato.Id}</td>
                                    <td>${dato.Nombre}</td>
                                    <td>${dato.Cargo}</td>
                                    <td>${dato.Fechain}</td>
                                    <td>
                                        <a href="editar.htm?id=${dato.Id}" class="btn btn-warning">Editar</a>
                                        <a href="eliminar.htm?id=${dato.Id}" class="btn btn-danger">Eliminar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                    </table>

                </div>
            </div>
        </div>
    </body>
</html>
