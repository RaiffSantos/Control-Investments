
package control;

import database.ConectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Objetivo;

/**
 *
 * @author Raiff
 */
public class ObjetivoController {
    
    private static ObjetivoController controladorObjetivo;
    
    public static ObjetivoController getInstance(){
        if(controladorObjetivo == null){
            controladorObjetivo = new ObjetivoController();
            return controladorObjetivo;
        }
        return controladorObjetivo;
    }
    
    public static boolean cadastrarObjetivo(Objetivo objetivo){
        ConectionFactory conecta = new ConectionFactory();
        conecta.getConnection();
                
        try {
            String sql = "INSERT INTO objetivo() VALUES(?,?,?,?,?)";
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, objetivo.getNome());
            pst.setString(3, objetivo.getDescricao());
            pst.setDouble(4, objetivo.getValor());
            pst.setDouble(5, 0);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ObjetivoController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + ex.getMessage());
        }
        conecta.desconecta();
        return true;
    }
    
    public static boolean deletarObjetivo(Objetivo objetivo){
        
        ConectionFactory conecta = new ConectionFactory();
        conecta.getConnection();
               
        try {
            String sql = "DELETE FROM objetivo WHERE id = ?";
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setInt(1, objetivo.getId());
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ObjetivoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
}
