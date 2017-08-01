/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import bd.ConexionBD;
import entidades.restaurante;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author julian 
 */
public class IngresoRestaurante extends HttpServlet {

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
        /*
        * REHABILITAR PUERTO PARA TOMCAT
        * CMD > netstat -ao
        * Revisar pid en administrador de tareas y terminar proceso para liberar puerto 8080.
        */
        
        String nom = request.getParameter("nombre");
        String ubi = request.getParameter("ubicacion");
        String desc = request.getParameter("descripcion");
        String cap = request.getParameter("capacidad");
        String hor = request.getParameter("hora");
        String punt = request.getParameter("puntos");
        boolean resultado = true;
        
        try{
            //conectar con base datos
            ConexionBD c = new ConexionBD();
            c.conectar();
            restaurante r = new restaurante(nom, ubi, desc, Integer.parseInt(cap), hor, Integer.parseInt(punt));
            resultado =  c.ingresarRestaurante(r);
        }catch (Exception e){
            resultado = false;
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IngresoEquipo</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //out.println("<h1>Servlet IngresoEquipo at " + request.getContextPath() + "</h1>");
            if(resultado){
                out.println("<h1>Se ingres&oacute; correctamente el registro</h1>");
            }else{
                out.println("<h1>Ocurri&oacute; un error en el ingreso</h1>");            
            }
            
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
