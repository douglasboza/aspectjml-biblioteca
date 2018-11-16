package model;

import org.multijava.mjc.CGFCollectionMap.SetMap;

public class Multa {
    private int id_multa;
    private int id_cliente;
    private String descricao;
    private float valor;

    public Multa(int id_multa, int id_emprestimo, String descricao, float valor, String pagamento) {
    	setId_multa(id_multa);
    	setId_cliente(id_emprestimo);
    	setDescricao(descricao);
    	setValor(valor);
    	
        //this.id_multa = id_multa;
        //this.id_cliente = id_emprestimo;
        //this.descricao = descricao;
        //this.valor = valor;
    }

    public Multa() {
    }

    public int getId_multa() {
        return id_multa;
    }
    
	/*@ public constraint 
	  @ 	this.id_multa == \old(this.id_multa) || 0 == \old(this.id_multa);
	  @	requires id_multa > 0;
	  @*/
    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }
    
	/*@ requires valor >= 0;
	  @*/
    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
