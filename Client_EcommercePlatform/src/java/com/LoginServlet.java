/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author FORGE-15 I7
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
           
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            boolean status = login(email, password);
            String CustomerName = returnName();
            // Creating The 'RequestDispatcher' Object For Forwading The HTTP Request       
            RequestDispatcher rdObj = null;
            if(status){
                //out.println("Login Success");
                //out.write("<p id='successMsg' style='color: green; font-size: larger;'> Welcome " + CustomerName + "</p>");
                
                request.setAttribute("Name", CustomerName);
                request.getRequestDispatcher("/Homepage.jsp").forward(request,response);
                
                HttpSession session = request.getSession();
                session.setAttribute("Email",email);
                response.sendRedirect(request.getContextPath() + "/Homepage.jsp");
//                rdObj = request.getRequestDispatcher("/Homepage.jsp");
//                rdObj.include(request, response);
                
                
            }else{
                //out.println("Login Failed");
                out.write("<p id='errMsg' style='color: red; font-size: larger;'>Invalid Email or Password. Please try again</p>");
                rdObj = request.getRequestDispatcher("/index.jsp");
                rdObj.include(request, response);
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


    private boolean login(java.lang.String email, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.LoginRegister port = service.getLoginRegisterPort();
        return port.login(email, password);
    }

    private String returnName() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.LoginRegister port = service.getLoginRegisterPort();
        return port.returnName();
    }
}
