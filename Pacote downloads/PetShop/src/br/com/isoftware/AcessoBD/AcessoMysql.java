
package br.com.isoftware.AcessoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class AcessoMysql {    
             
    Connection con;
      
    public Connection conectar(){       
            
        try {
              Class.forName("com.mysql.jdbc.Driver");            
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/melhoramigopeludobd?useTimezone=true&serverTimezone=UTC","root","");
             }
             catch (ClassNotFoundException ex) {
                     ex.printStackTrace(); 
                     System.out.println("Driver não encotrado!!!");            
                     }
                      catch (SQLException ex) {            
                             ex.printStackTrace();
                             System.out.println("Não foi possivel conectar ao Bando!!");  
                             }
        return con;      
    }
   
      public void desconectar(){          
            try {
                 con.close();
                 }
                  catch (SQLException ex) {
                       ex.printStackTrace();                        
                       }            
                 }
    
}
