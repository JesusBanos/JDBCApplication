/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapplication;

import java.sql.*;
/**
 *
 *
 */
public class JDBCApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Carga exitosa");
            String url = "jdbc:postgresql://localhost/jesus?user=topicos&password=12345";
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Conexion realizada");
            Statement st = conn.createStatement();
            st.execute("insert into " +
                    " tabla (id, nombre, apellido)" +
                    " values (1,'Jesus', 'Baños')");
            conn.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("error: controlador!");
            System.exit(1);
        } catch (SQLException ex) {
            System.out.println("Error: conexion!");
            ex.printStackTrace();
        }
    }
    
}
