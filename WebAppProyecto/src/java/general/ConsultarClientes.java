/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import bd.ConexionBD;
import entidades.cliente;
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
public class ConsultarClientes extends HttpServlet {

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
        
        //proceso para consultar clientes
        ConexionBD c = new ConexionBD();
        ArrayList<cliente> clientes = new ArrayList<cliente>();
        try{
            c.conectar();
            clientes = c.consultarClientes("","cliente");
        }catch (Exception e){}
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConsultarClientes</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet ConsultarClientes at " + request.getContextPath() + "</h1>");
            
            out.println("<h1>CONSULTA CLIENTES</h1>");
            
            //out.println("<h1>Servlet ConsultarUsuarios at " + request.getContextPath() + "</h1>");
            //color teal = #008080
            out.println("<table border='1'>");
            //primera fila
            out.println("<tr bgcolor='#ffff00'>"
                    + "<td>ID</td>"
                    + "<td>Cedula</td>"
                    + "<td>Nombres</td>"
                    + "<td>Apellidos</td>"
                    + "<td>Correo</td>"
                    + "<td>Direccion</td>"
                    + "<td>Telefono</td>"
                    + "<td>Tipo</td>"
                    + "<td>Saldo</td>"
                    + "<td>Descuento</td>"
                    + "<td>Edad</td>"
                    + "<td>Sexo</td>"
                    + "<td>Id Usuario</td>");
            //filas con informacion
            int i=1; 
            for (cliente cli:clientes){
                out.print("<tr");
                //color impar plomo
                if(i%2!=0){ out.print(" bgcolor='#808080'>");
                }else{ out.print(">");}  
                
                out.print("<td>"+cli.getId()+"</td>"
                        + "<td>"+cli.getCedula()+"</td>"
                        + "<td>"+cli.getNombres()+"</td>"
                        + "<td>"+cli.getApellidos()+"</td>"
                        + "<td>"+cli.getCorreo()+"</td>"
                        + "<td>"+cli.getDireccion()+"</td>"
                        + "<td>"+cli.getTelefono()+"</td>"
                        + "<td>"+cli.getTipo()+"</td>"
                        + "<td>"+cli.getSaldo()+"</td>"
                        + "<td>"+cli.getDescuento()+"</td>"
                        + "<td>"+cli.getEdad()+"</td>"
                        + "<td>"+cli.getSexo()+"</td>"
                        + "<td>"+cli.getId_usuario()+"</td>");
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
