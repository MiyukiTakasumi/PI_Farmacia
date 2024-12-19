/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Andrea
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoDAO {
    
        public Connection conectaBD(){//METODO PUBLICO P/CONECTAR BD TIPO CONNECTION
        Connection conn = null;//VARIAVEL conn
        try {
            String url = "jdbc:mysql://localhost:3306/projeto_integrador_farmacia?user=root&password=05032024Mtiloveyou";
            conn = DriverManager.getConnection(url);
            JOptionPane.showMessageDialog(null, "CONECTADO!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO"+erro.getMessage());
        }
        return conn;
    }
}
