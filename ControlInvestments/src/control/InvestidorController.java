
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
    
    private Investidor investidor;

    public Investidor getInvestidor() {
        return investidor;
    }

    public void setInvestidor(Investidor investidor) {
        this.investidor = investidor;
    }
    
    
    public void CadastrarInvestidor(String nome){
        
        ConectionFactory conecta = new ConectionFactory();
        conecta.getConnection();
        String sql = "insert into investidor(id, nome) values(?,?)";
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, null);
            pst.setString(2, nome);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(InvestidorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + ex.getMessage());
        }
        conecta.desconecta();
    }
    
    public void deletarInvestidor(String nome){
        
        ConectionFactory conecta = new ConectionFactory();
        conecta.getConnection();
        
        try{
            String sql = "delete from investidor WHERE nome = '" +nome+"'";
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao Conectar! \n Erro: " + ex.getMessage());
        }
        
    }
}
