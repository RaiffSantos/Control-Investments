
package model;
/**
 *
 * @author Raiff
 */
public class Investidor {
    
    private String nome;
    private double totalInvestido;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getTotalInvestido(){
        return this.totalInvestido;
    }
    
    public void setTotalInvestido(double totalInvestido){
        this.totalInvestido = totalInvestido;
    }
    
}
