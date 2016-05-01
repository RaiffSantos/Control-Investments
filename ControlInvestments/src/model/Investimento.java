
package model;

/**
 *
 * @author Raiff
 */
public class Investimento {
    
    private Investidor investidor;
    private Objetivo objetivo;
    private double valor;
    private String data;
    
    public Investimento(Investidor investidor){
        this.investidor = investidor;
    }
    
    public void investir(double valor, String data, Objetivo objetivo){
        this.valor = valor;
        this.data = data;
        objetivo.setAtual(objetivo.getAtual() + valor);
        investidor.setTotalInvestido(investidor.getTotalInvestido() + valor);
    }
   
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Investidor getInvestidor() {
        return investidor;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }
    
    
    
}
