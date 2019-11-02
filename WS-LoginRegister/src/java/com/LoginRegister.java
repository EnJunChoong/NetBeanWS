/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.sql.DataSource;

/**
 *
 * @author FORGE-15 I7
 */
@WebService(serviceName = "LoginRegister")
public class LoginRegister {
    String CustomerName= null;  
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "email") String email, @WebParam(name = "password") String password) {

        boolean loginStatus = false;  
        
        try{
            //TODO write your implementation code here:
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            
            String sql = "SELECT * FROM CUSTOMER WHERE EMAIL = '" + email + "' AND PASSWORD = '" + password + "'";
            System.out.println(sql);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql); 
            loginStatus = rs.next(); 
            CustomerName = rs.getString(1);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        return loginStatus; 
    }
    
     public String ReturnName(){
        return CustomerName; 
    }
        

    /**
     * Web service operation
     */
    @WebMethod(operationName = "register")
    public boolean register(@WebParam(name = "id") int id, 
            @WebParam(name = "discountCode") String discountCode, 
            @WebParam(name = "zip") String zip, 
            @WebParam(name = "name") String name, 
            @WebParam(name = "address1") String address1, 
            @WebParam(name = "address2") String address2, 
            @WebParam(name = "city") String city, 
            @WebParam(name = "state") String state, 
            @WebParam(name = "phone") String phone, 
            @WebParam(name = "fax") String fax, 
            @WebParam(name = "email") String email, 
            @WebParam(name = "creditLimit") int creditLimit, 
            @WebParam(name = "password") String password) {
        //TODO write your implementation code here:
        
        try{
            //TODO write your implementation code here:
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            String sql = "INSERT INTO APP.CUSTOMER (CUSTOMER_ID, DISCOUNT_CODE, ZIP, NAME, ADDRESSLINE1, ADDRESSLINE2, CITY, STATE, PHONE, FAX, EMAIL, CREDIT_LIMIT, PASSWORD)" 
                    + "VALUES (" + id + ", "
                    + "'" + discountCode + "', "
                    + "'" + zip + "', "
                    + "'" + name + "', "
                    + "'" + address1 + "', "
                    + "'" + address2 + "', "
                    + "'" + city + "', "
                    + "'" + state + "', "
                    + "'" + phone + "', "
                    + "'" + fax + "', "
                    + "'" + email + "', "
                    + creditLimit + ", "
                    + "'" + password + "')";
     
            System.out.println(sql);

            Statement st = conn.createStatement();
            st.executeUpdate(sql);

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
        
        return true;
    }

}
