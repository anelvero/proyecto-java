/*con esta clase nos conectanos a la base de datos 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author Andres
 */
public class Conectar {

    private static Connection conn; 
    private static final String driver = "com.msql.jdbc.Driver";
    private static final String user = "root"; 
    private static final String password = "Andres1983@"; 
    private static final String url = "jdbc:mysql://localhost:3306/empresaCrediYa";    

 public Conectar() {
    conn = null;
    try {
     class.forName (driver);
     conn = DriverManager.getConnection(url, user, password);
     if (conn != null) {
        System.out.println("conexion establecida..");
        }
     }catch (classNotFoundException | SQLException e) {
        System.out.println("error al conectar" + e);
     }
 }
 public 
 
 