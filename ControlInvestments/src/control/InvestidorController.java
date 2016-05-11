
package control;

import database.ConectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    public static boolean CadastrarInvestidor(Investidor investidor){
        
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
        return true;
    }
    
    public static boolean deletarInvestidor(Investidor investidor){
        
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
        conecta.desconecta();
        return true;
    }
    
    public static boolean editarInvestidor(Investidor investidor){
        
        ConectionFactory conecta = new ConectionFactory();

        try {
            String sql = "UPDATE investidor SET nome = ?, totalinvestido = ? WHERE id = ?";
            PreparedStatement pst = conecta.conn.prepareStatement(sql);
            pst.setString(1, investidor.getNome());
            pst.setDouble(2, investidor.getTotalInvestido());
            pst.setInt(3, investidor.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(InvestidorController.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao editar" + ex.getMessage());
        }
        conecta.desconecta();
        return true;
    }
    
    public static ArrayList listarInvestidores(){
        
        ConectionFactory conecta = new ConectionFactory();
        conecta.getConnection();
        ArrayList investidores = new ArrayList();
        
        try {
            
            String sql = "SELECT * FROM investidor";
        
            PreparedStatement pst;
            pst = conecta.conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                investidores.add(new Object[]{
                    rs.getInt("id"), 
                    rs.getString("nome"), 
                    rs.getString("totalinvestido")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(InvestidorController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return investidores;
    }
}
