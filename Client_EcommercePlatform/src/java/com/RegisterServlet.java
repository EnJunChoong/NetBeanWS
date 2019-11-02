/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author FORGE-15 I7
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WS-LoginRegister/LoginRegister.wsdl")
    private LoginRegister_Service service;


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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
            
            int id = Integer.parseInt(request.getParameter("id"));
            String discountCode = request.getParameter("discountCode");
            String zip = request.getParameter("zip");
            String name = request.getParameter("name");  
            String address1 = request.getParameter("address1");
            String address2 = request.getParameter("address2");
            String city = request.getParameter("city");
            String state = request.getParameter("state"); 
            String phone = request.getParameter("phone");
            String fax = request.getParameter("fax");
            String email = request.getParameter("email");
            int creditLimit = Integer.parseInt(request.getParameter("creditLimit"));
            String password = request.getParameter("password"); 
            
            boolean status = register(id, discountCode, zip, name, address1, address2, city, state, phone, fax, email, creditLimit, password);
            
            RequestDispatcher rdObj = null;
         
            
            if(status){
                //out.println("Register Success");
                out.write("<p id='successMsg' style='color: green; font-size: larger;'>Register Success. Please sign in.");
                rdObj = request.getRequestDispatcher("/index.jsp");
                rdObj.include(request, response);
            }else{
                //out.println("Register Failed");
                out.write("<p id='errMsg' style='color: red; font-size: larger;'>Register Failed. Please try again</p>");
            }   
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

    private boolean register(int id, java.lang.String discountCode, java.lang.String zip, java.lang.String name, java.lang.String address1, java.lang.String address2, java.lang.String city, java.lang.String state, java.lang.String phone, java.lang.String fax, java.lang.String email, int creditLimit, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.LoginRegister port = service.getLoginRegisterPort();
        return port.register(id, discountCode, zip, name, address1, address2, city, state, phone, fax, email, creditLimit, password);
    }


}
