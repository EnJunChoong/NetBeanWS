/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.ClassNotFoundException_Exception;
import com.ProfileInfo_Service;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author EnJunz-Win10
 */
@WebServlet(urlPatterns = {"/ProfileInfoServlet"})
public class ProfileInfoServlet extends HttpServlet {

    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WS-ProfileInfo/ProfileInfo.wsdl")
    private ProfileInfo_Service service;


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws com.ClassNotFoundException_Exception
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException_Exception {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession();
            String Email = (String)session.getAttribute("Email");
            
            getProfile(Email);
            
            String CustomerName = customerName();
            String Address1 = address1();
            String Address2 = address2();
            String Zip = zip();
            String City = city();
            String State = state();
            String Phone = phone();            
            
            request.setAttribute("Name", CustomerName);
            request.setAttribute("Email", Email);
            request.setAttribute("Add2", Address2);
            request.setAttribute("Add1", Address1);
            request.setAttribute("Zip", Zip);
            request.setAttribute("City", City);
            request.setAttribute("State", State);
            request.setAttribute("Phone", Phone);
            
            request.getRequestDispatcher("/ProfileInfo.jsp").forward(request,response);

            
        response.sendRedirect(request.getContextPath() + "/ProfileInfo.jsp");
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException_Exception ex) {
            Logger.getLogger(ProfileInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
//        String customerEmail = request.getParameter("email");
        } catch (ClassNotFoundException_Exception ex) {
            Logger.getLogger(ProfileInfoServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void getProfile(java.lang.String email) throws ClassNotFoundException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ProfileInfo port = service.getProfileInfoPort();
        port.getProfile(email);
    }

    private String customerName() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ProfileInfo port = service.getProfileInfoPort();
        return port.customerName();
    }

    private String address1() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ProfileInfo port = service.getProfileInfoPort();
        return port.address1();
    }

    private String address2() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ProfileInfo port = service.getProfileInfoPort();
        return port.address2();
    }

    private String city() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ProfileInfo port = service.getProfileInfoPort();
        return port.city();
    }

    private String zip() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ProfileInfo port = service.getProfileInfoPort();
        return port.zip();
    }

    private String phone() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ProfileInfo port = service.getProfileInfoPort();
        return port.phone();
    }

    private String state() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ProfileInfo port = service.getProfileInfoPort();
        return port.state();
    }

}
