/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProfileInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author EnJunz-Win10
 */
@WebService(serviceName = "ProfileInfo")
public class ProfileInfo {
    String CustomerName = null;
    String Address1 = null;
    String Address2 =null;
    String Zip = null;
    String City = null;
    String State = null;
    String Phone = null;

    /**
     * This is a sample web service operation
     * @param Email
     * @throws java.lang.ClassNotFoundException
     */
    @WebMethod(operationName = "GetProfile")
    public void GetProfile(@WebParam(name = "Email") String Email ) throws ClassNotFoundException {
 
 
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            
            
            String sql = "SELECT NAME, ADDRESSLINE1, ADDRESSLINE2, ZIP, CITY, STATE, PHONE FROM CUSTOMER WHERE EMAIL = '"+Email+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            CustomerName = rs.getString(1);
            Address1 = rs.getString(2);
            Address2 = rs.getString(3);
            Zip = rs.getString(4);
            City = rs.getString(5);
            State = rs.getString(6);
            Phone = rs.getString(7);
            conn.close();
                    
        } catch (ClassNotFoundException | SQLException ex) {
        
            System.err.println(ex.getMessage());
        }
    }
    
    public String CustomerName(){
        return CustomerName;
    }
    public String Address1(){
        return Address1;
    }
    public String Address2(){
        return Address2;
    }
    public String Zip(){
        return Zip;
    }
    public String City(){
        return City;
    }
    public String State(){
        return State;
    }
    public String Phone(){
        return Phone;
    }
           
}
