/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import bd.ConexionBD;
import entidades.usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author julian
 */
public class ConsultarUsuarios extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //proceso para consultar usuarios
        ConexionBD c = new ConexionBD();
        ArrayList<usuario> usuarios = new ArrayList<usuario>();
        try{
            c.conectar();
            usuarios = c.consultarUsuarios();
        }catch (Exception e){}
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConsultarUsuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1>CONSULTA USUARIOS</h1>");
            
            //out.println("<h1>Servlet ConsultarUsuarios at " + request.getContextPath() + "</h1>");
            //color teal = #008080
            out.println("<table border='1'>");
            //primera fila
            out.println("<tr bgcolor='#008080'><td>ID</td><td>Cuenta</td><td>Rol</td><td>Estado</td><td>Fecha de Registro</td>");
            //filas con informacion
            int i=1; 
            for (usuario u:usuarios){
                out.print("<tr");
                //color impar
                if(i%2!=0){ out.print(" bgcolor='#808080'>");
                }else{ out.print(">");}  
                
                out.print("<td>"+u.getId()+"</td><td>"+u.getCuenta()+"</td><td>"+u.getRol()+"</td><td>"+u.getEstado()+"</td><td>"+u.getFecha_registro()+"</td>");
                out.print("</tr>");
                i++;
                }
            out.println("</table>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
