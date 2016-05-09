
package control;

import database.ConectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Investidor;

/**
 *
 * @author Raiff
 */
public class InvestidorController{
    
    private static InvestidorController investidorController;
    
    public static InvestidorController getInstance(){
        if(investidorController == null){
            investidorController = new InvestidorController();
            return investidorController;
        }
        return investidorController;
    }
    
    public void CadastrarInvestidor(Investidor investidor){
        
        ConectionFactory conecta = new ConectionFactory();
        conecta.getConnection();
        String sql = "insert into investidor(id, nome, totalinvestido) values(?,?,?)";
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, investidor.getNome());
            pst.setDouble(3, 0);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(InvestidorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + ex.getMessage());
        }
        conecta.desconecta();
    }
    
    public void deletarInvestidor(Investidor investidor){
        
        ConectionFactory conecta = new ConectionFactory();
        conecta.getConnection();
        
        try{
            String sql = "delete from investidor WHERE nome = ?";
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, investidor.getNome());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + ex.getMessage());
        }
        
    }
    
    public void editarInvestidor(){
        
    }
}
