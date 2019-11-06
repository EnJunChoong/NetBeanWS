/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kwang
 */
@WebService(serviceName = "hardware")
public class hardware {
    List nestedList = new ArrayList();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetHardware")
    public String GetHardware(@WebParam(name = "product_id") String product_id) throws ClassNotFoundException {
        //TODO write your implementation code here:
        StringBuilder builder = new StringBuilder();
        String text="";
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String db_server;
        
            db_server = "jdbc:derby://localhost:1527/sample";
            Connection conn = DriverManager.getConnection(db_server, "app", "app");
            String sql = "SELECT DESCRIPTION, PURCHASE_COST, QUANTITY_ON_HAND, AVAILABLE FROM PRODUCT WHERE PRODUCT_CODE= '" + product_id + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                builder.append("<tr><td>");
                builder.append(rs.getString(1));
                builder.append("</td><td>");
                builder.append(rs.getDouble(2));   
                builder.append("</td><td>");     
                builder.append(rs.getInt(3));
                builder.append("</td><td>");
                builder.append(rs.getString(4));
                builder.append("</td></tr>");
            }
        text=builder.toString();
//           
//            
//            logic = rs.next();
//            product_description = rs.getString(1);
//            cost = rs.getDouble(2);
//            quantity = rs.getInt(3);
//            availability = rs.getString(4);
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return text;
    }
}
