package model;


public class Multa {
    private /*@ spec_public nullable @*/ int id_multa;
    private /*@ spec_public nullable @*/ int id_cliente;
    private /*@ spec_public nullable @*/ String descricao;
    private /*@ spec_public nullable @*/ float valor;
    
	//@ public invariant valor >= 0;
	//@ public initially id_multa == 0;
    //@ public initially id_cliente == 0;
    
    /*@ public constraint 
	  @ 	this.id_cliente == \old(this.id_cliente) || 0 == \old(this.id_cliente);
    */

    /*@ public constraint 
	  @ 	this.id_multa == \old(this.id_multa) || 0 == \old(this.id_multa);
    */
    
    public Multa(int id_multa, int id_emprestimo, String descricao, float valor, String pagamento) {
    	setId_multa(id_multa);
    	setId_cliente(id_emprestimo);
    	setDescricao(descricao);
    	setValor(valor);
    }

    public Multa() {
    }
    
    // @ assignable \nothing
    public int getId_multa() {
        return id_multa;
    }
    
    /*@	requires id_multa >= 0;
	  @ ensures this.id_multa == id_multa; 
	  @ assignable this.id_multa;
	  @ also
	  @ 	requires id_multa < 0;
	  @ 	assignable \nothing;
	  @ 	ensures this.id_multa == \old(this.id_multa);
	@*/
    public void setId_multa(int id_multa) {
    	if(id_multa >= 0) {
    	    this.id_multa = id_multa;	
    	}
    }
    
    // @ assignable \nothing
    public int getId_cliente() {
        return id_cliente;
    }

    /*@	requires id_cliente >= 0;
	  @ ensures this.id_cliente == id_cliente; 
	  @ assignable this.id_cliente;
	  @ also
	  @ 	requires id_cliente < 0;
	  @ 	assignable \nothing;
	  @ 	ensures this.id_cliente == \old(this.id_cliente);
	@*/
    public void setId_cliente(int id_cliente) {
    	if(id_cliente >= 0){
    		this.id_cliente = id_cliente;
    	}
    }
    
    // @ assignable \nothing;
    public String getDescricao() {
        return descricao;
    }
    
	/*@	requires descricao != null && !descricao.equals("");
	  @ ensures this.descricao == descricao; 
	  @ assignable this.descricao;
	  @ also
	  @ 	requires descricao.equals("");
	  @ 	assignable \nothing;
	  @ 	ensures this.descricao == \old(this.descricao);
	@*/
    public void setDescricao(String descricao) {
    	if(!descricao.equals("")) {
    		this.descricao = descricao;	
    	}
    }
    
    // @ assignable \nothing
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
