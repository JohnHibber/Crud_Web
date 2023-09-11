<%-- 
    Document   : add
    Created on : 7/09/2023, 12:33:38 p. m.
    Author     : John Hibber
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-4">
              <h1>Agregar Persona</h1>
        <form action="Controlador">
            Nombres: <br>
            <input class="form-control" type="text" name="txtNom"><br> 
            Apellidos: <br>
            <input class="form-control" type="text" name="txtApe"><br> 
            Correo <br> 
            <input class="form-control" type="email" name="txtCor"><br> 
            <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br> 
        </form>  
            </div>
        </div>
    </body>
</html>
