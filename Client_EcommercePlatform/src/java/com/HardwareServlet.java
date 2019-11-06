/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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
 * @author Kdwing
 */
@WebServlet(name = "HardwareServlet", urlPatterns = {"/HardwareServlet"})
public class HardwareServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WS-Hardware/hardware.wsdl")
    private Hardware_Service service;
   

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
        String text;
        
                
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String productId = "HW";
            text = getHardware(productId);
//            while (getHardware(productId)){
//                
//                list.add(productDescription());
//                list.add(cost());
//                list.add(quantity());
//                list.add(availability());
//                nestedList.add(list);
////                String availability = availability();
////                Double cost = cost();
////                String productDescription = productDescription();
////                int quantity = quantity();
//            }
            
            
            
//            request.setAttribute("Name", listName);
//            request.setAttribute("Price", listPrice);
//            request.setAttribute("Quantity", listName);
//            request.setAttribute("Availability", listAvail);
            request.setAttribute("string", text);
            request.getRequestDispatcher("/HardwareInfo.jsp").forward(request, response);
            response.sendRedirect(request.getContextPath() + "/HardwareInfo.jsp");
            
        } catch (ClassNotFoundException_Exception ex) {
            Logger.getLogger(HardwareServlet.class.getName()).log(Level.SEVERE, null, ex);
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

    private String getHardware(java.lang.String productId) throws ClassNotFoundException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.Hardware port = service.getHardwarePort();
        return port.getHardware(productId);
    }

//    private String availability() {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        com.Hardware port = service.getHardwarePort();
//        return port.availability();
//    }
//
//    private Double cost() {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        com.Hardware port = service.getHardwarePort();
//        return port.cost();
//    }
//
//    private String productDescription() {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        com.Hardware port = service.getHardwarePort();
//        return port.productDescription();
//    }
//
//    private int quantity() {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        com.Hardware port = service.getHardwarePort();
//        return port.quantity();
//    }
}