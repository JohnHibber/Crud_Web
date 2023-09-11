

<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
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
                <%
              PersonaDAO dao=new PersonaDAO();  
              int id=Integer.parseInt((String)request.getAttribute("idper"));
              Persona p=(Persona)dao.list(id);
              %>
        <h1>Modificar Persona</h1>
        <form action="Controlador">
            Nombres: <br>
            <input class="form-control" type="text" name="txtNom" value="<%= p.getNom()%>"><br> 
            Apellidos: <br>
            <input class="form-control" type="text" name="txtApe" value="<%= p.getApe()%>"><br> 
            Correo <br> 
            <input class="form-control" type="email" name="txtCor" value="<%= p.getCor()%>"><br> 
            <input type="hidden" name="txtid" value="<%= p.getId()%>">
            <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"><br>
            <br><!-- comment -->
            <a class="btn btn-primary" href="Controlador?accion=listar">Regresar</a>
        </form>
            </div>
            
        </div>
    </body>
</html>
