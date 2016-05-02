
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Raiff
 */
public class ConectionFactory {
    
    public Statement stm;
    public ResultSet rs;
    private String url = "jdbc:mysql://127.0.0.1/mydb";
    private String user = "root";
    private String pass = "";
    public Connection conn;
    
    public void getConnection(){
    
        try{
            conn = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + e.getMessage());
        }
    }
    
    public void executaSQL(String sql){
        
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro no executaSQL! \n Erro: " + ex.getMessage());
        }
        
    }
    
    public void desconecta(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Fechar a Conexão! \n Erro: " + ex.getMessage());
        }
    }
        
}
