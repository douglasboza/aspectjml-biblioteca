package model;

import org.multijava.mjc.CGFCollectionMap.SetMap;

public class Multa {
    private /*@ nullable @*/ int id_multa;
    private /*@ nullable @*/ int id_cliente;
    private /*@ nullable @*/ String descricao;
    private /*@ nullable @*/ float valor;

    public Multa(int id_multa, int id_emprestimo, String descricao, float valor, String pagamento) {
    	setId_multa(id_multa);
    	setId_cliente(id_emprestimo);
    	setDescricao(descricao);
    	setValor(valor);
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
    
	/*@	requires valor > 0;
	  @ ensures this.valor == valor; 
	  @ assignable this.valor;
	  @ also
	  @ 	requires valor <= 0;
	  @ 	assignable \nothing;
	  @ 	ensures this.valor == 0;
	@*/
    public void setValor(float valor) {
    	if(valor <= 0) {
    		this.valor = 0;
    	}else {
    		this.valor = valor;
    	}
        
    }
    
}
