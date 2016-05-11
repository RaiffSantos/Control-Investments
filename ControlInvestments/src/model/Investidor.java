
package model;
/**
 *
 * @author Raiff
 */
public class Investidor {
    
    private int id;
    private String nome;
    private double totalInvestido;
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
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
