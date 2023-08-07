
package sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionMysql {
    Connection cn;
   
public Connection conectar () {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
         cn= (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/academia","root","1234");
        System. out.println ("CONECTADO");
     } catch (ClassNotFoundException | SQLException e) {
         JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
     }
     return cn;

} 
  
}
