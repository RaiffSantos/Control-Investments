
package ControlInvestments;

import control.InvestidorController;
import database.ConectionFactory;
import model.Investidor;
import model.Investimento;
import model.Objetivo;
import view.TelaPrincipal;

/**
 *
 * @author Raiff
 */
public class ControlInvestments {

    public static void main(String[] args) {
        
        //ConectionFactory con = new ConectionFactory();
        //con.getConnection();
        
        TelaPrincipal frm = new TelaPrincipal();
        frm.setVisible(true);
        /*
        Investidor invest1 = new Investidor();
        Investidor invest2 = new Investidor();
        
        Investimento inv1 = new Investimento(invest1);
        Investimento inv2 = new Investimento(invest2);
        
        Objetivo objet1 = new Objetivo();
        Objetivo objet2 = new Objetivo();
        
        objet1.setValor(5000);
        objet1.setNome("Valor dos moveis");
        objet1.setDescricao("Juntar o valor para a compra dos móveis até o final do ano");
        System.out.println("Objetivo: " + objet1.getNome() + " Valor: " + objet1.getValor() + " Progresso: " + objet1.getAtual());
  
        inv1.investir(300, "24.04.2016", objet1);
        inv1.investir(50, "24.04.2016",  objet1);        
        inv2.investir(500, "24.04.2016", objet1);
        
        objet2.setValor(7000);
        objet2.setNome("Valor da casa");
        objet2.setDescricao("Juntar o valor da casa");
        System.out.println("Objetivo: " + objet2.getNome() + " Valor: " + objet2.getValor() + " Progresso: " + objet2.getAtual());
        
        inv1.investir(1000, "24.04.2016", objet2);
        inv1.investir(500, "24.04.2016",  objet2);        
        inv2.investir(5000, "24.04.2016", objet2);
        
        System.out.println("Objetivo: " + objet1.getNome() + " Valor: " + objet1.getValor() + " Progresso: " + objet1.getAtual());
        System.out.println("Objetivo: " + objet2.getNome() + " Valor: " + objet2.getValor() + " Progresso: " + objet2.getAtual());
        
        System.out.println("Investidor 1: " + invest1.getTotalInvestido());
        System.out.println("Investidor 2: " + invest2.getTotalInvestido());*/
        
    }
    
}
