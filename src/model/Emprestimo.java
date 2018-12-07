
package model;

public class Emprestimo {
    
    private /*@ spec_public nullable @*/ int id_emprestimo;
    private /*@ spec_public nullable @*/ int id_cliente;
    private /*@ spec_public nullable @*/ int id_livro;
    private /*@ spec_public nullable @*/ String data_emprestimo;
    private /*@ spec_public nullable @*/ String data_devolucao;
    
	//@ public invariant data_emprestimo != "";
	//@ public initially id_emprestimo == 0;
    /*@ public constraint 
	  @ 	this.id_cliente == \old(this.id_cliente) || 0 == \old(this.id_cliente);
   	*/
    
    /*@ public constraint 
	  @ 	this.id_livro == \old(this.id_livro) || 0 == \old(this.id_livro);
 	*/
    
    /*@ public constraint 
	  @ 	this.id_emprestimo == \old(this.id_emprestimo) || 0 == \old(this.id_emprestimo);
 	*/
    
    public Emprestimo() {
    }   

    public Emprestimo(int id_emprestimo, int id_cliente, int id_livro, String data_emprestimo, String data_devolucao) {
        setId_emprestimo(id_emprestimo);
        setId_cliente(id_cliente);
        setId_livro(id_livro);
        setData_emprestimo(data_emprestimo);
        setData_emprestimo(data_devolucao);
    }
    
    // @ assignable \nothing
    public int getId_emprestimo() {
        return id_emprestimo;
    }
    
    /*@	requires id_emprestimo >= 0;
	  @ ensures this.id_emprestimo == id_emprestimo; 
	  @ assignable this.id_emprestimo;
	  @ also
	  @ 	requires id_emprestimo < 0;
	  @ 	assignable \nothing;
	  @ 	ensures this.id_emprestimo == \old(this.id_emprestimo);
	@*/
    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }
    
    /*@	ensures id_cliente == \old(id_cliente);@*/
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
    	if(id_cliente >= 0) {
    		this.id_cliente = id_cliente;
    	}
    }
    
    /*@	ensures id_livro == \old(id_livro);@*/
    public int getId_livro() {
        return id_livro;
    }
    
    /*@	requires id_livro >= 0;
	  @ ensures this.id_livro == id_livro; 
	  @ assignable this.id_livro;
	  @ also
	  @ 	requires id_livro < 0;
	  @ 	assignable \nothing;
	  @ 	ensures this.id_livro == \old(this.id_livro);
	@*/
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }
    
    /*@	ensures data_emprestimo == \old(data_emprestimo);@*/
    public String getData_emprestimo() {
        return data_emprestimo;
    }
    
	/*@	requires data_emprestimo != null && !data_emprestimo.equals("");
	  @ ensures this.data_emprestimo == data_emprestimo; 
	  @ assignable this.data_emprestimo;
	  @ also
	  @ 	requires data_emprestimo.equals("");
	  @ 	assignable \nothing;
	  @ 	ensures this.data_emprestimo == \old(this.data_emprestimo);
	@*/
    public void setData_emprestimo(String data_emprestimo) {
    	if(!data_emprestimo.equals("")) {
    		this.data_emprestimo = data_emprestimo;
    	}
    }
    
    /*@	ensures data_devolucao == \old(data_devolucao);@*/
    public String getData_devolucao() {
        return data_devolucao;
    }
    
	/*@	requires data_devolucao != null && !data_devolucao.equals("");
	  @ ensures this.data_devolucao == data_devolucao; 
	  @ assignable this.data_devolucao;
	  @ also
	  @ 	requires data_devolucao.equals("");
	  @ 	assignable \nothing;
	  @ 	ensures this.data_devolucao == \old(this.data_devolucao);
	@*/
    public void setData_devolucao(String data_devolucao) {
    	if(!data_devolucao.equals("")) {
    		this.data_devolucao = data_devolucao;
    	}
    }
    
}
