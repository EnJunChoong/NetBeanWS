/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software_table;

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
 * @author Kdwing
 */
@WebService(serviceName = "software")
public class software {
    String product_description = null;
    Double cost = null;
    int quantity = 0;
    String availability = null;

    /**
     * It will show the user the table with appropriate product_id
     */
    @WebMethod(operationName = "GetSoftware")
    public void GetSoftware(@WebParam(name = "product_id") String product_id) throws ClassNotFoundException {
        //TODO write your implementation code here:
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String db_server;
            db_server = "jdbc:derby://localhost:1527/sample";
            Connection conn = DriverManager.getConnection(db_server, "app", "app");
            String sql = "SELECT DESCRIPTION, PURCHASE_COST, QUANTITY_ON_HAND, AVAILABLE FROM PRODUCT WHERE PRODUCT_CODE='" + product_id + "'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            rs.next();
            product_description = rs.getString(1);
            cost = rs.getDouble(2);
            quantity = rs.getInt(3);
            availability = rs.getString(4);
            conn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    public String product_description(){
        return product_description;
    }
    public Double cost(){
        return cost;
    }
    public int quantity(){
        return quantity;
    }
    public String availability(){
        return availability;
    }
}
