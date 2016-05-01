
package model;

/**
 *
 * @author Raiff
 */
public class Objetivo {
    
    private String nome;
    private String descricao;
    private double valor;
    private double atual;
    //private Investimento investimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAtual() {
        return atual;
    }

    public void setAtual(double atual) {
        this.atual = atual;
    }    
    
}
