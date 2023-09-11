
package Controlador;

import Modelo.Persona;
import ModeloDAO.PersonaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.nashorn.internal.runtime.Debug.id;

public class Controlador extends HttpServlet {

    String listar="vistas/listar.jsp";
    String add="vistas/add.jsp";
    String edit="vistas/edit.jsp";
    Persona p=new Persona();
    PersonaDAO dao=new PersonaDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           String acceso="";
           String action=request.getParameter("accion");
            if (action.equalsIgnoreCase("listar")){
                acceso=listar;
            } 
            else if (action.equalsIgnoreCase("add")) {
                acceso=add;
            } 
            else if (action.equalsIgnoreCase("Agregar")){
                String nom=request.getParameter("txtNom");
                String ape=request.getParameter("txtApe");
                String cor=request.getParameter("txtCor");
                p.setNom(nom);
                p.setApe(ape);
                p.setCor(cor);
                dao.add(p);
                acceso=listar;
            }   
            else if (action.equalsIgnoreCase("editar")){
                request.setAttribute("idper",request.getParameter("id"));
                acceso=edit;
            }
            else if (action.equalsIgnoreCase("Actualizar")){
               int id = Integer.parseInt(request.getParameter("txtid"));
                String nom=request.getParameter("txtNom");
                String ape=request.getParameter("txtApe");
                String cor=request.getParameter("txtCor");
                p.setId(id);
                p.setNom(nom);
                p.setApe(ape);
                p.setCor(cor);
                dao.edit(p);
                acceso=listar;
            }
            else if (action.equalsIgnoreCase("eliminar")){
               int id;
               id = Integer.parseInt(request.getParameter("id"));
               p.setId(id);
               dao.eliminar(id);
               acceso=listar;
            }
            
            RequestDispatcher vista=request.getRequestDispatcher(acceso);
            vista.forward(request, response);
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
