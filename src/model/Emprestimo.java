
package model;

public class Emprestimo {
    
    private /*@ spec_public nullable @*/ int id_emprestimo;
    private /*@ spec_public nullable @*/ int id_cliente;
    private /*@ spec_public nullable @*/ int id_livro;
    private /*@ spec_public nullable @*/ String data_emprestimo;
    private /*@ spec_public nullable @*/ String data_devolucao;

    public Emprestimo() {
    }   

    public Emprestimo(int id_emprestimo, int id_cliente, int id_livro, String data_emprestimo, String data_devolucao) {
        this.id_emprestimo = id_emprestimo;
        this.id_cliente = id_cliente;
        this.id_livro = id_livro;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }
    
 	/*@ public constraint 
	  @ 	this.id_emprestimo == \old(this.id_emprestimo) || 0 == \old(this.id_emprestimo);
	  @		requires id_emprestimo > 0;
	  @*/
    public int getId_emprestimo() {
        return id_emprestimo;
    }
    
 	/*@ public constraint 
	  @ 	this.id_emprestimo == \old(this.id_emprestimo) || 0 == \old(this.id_emprestimo);
	  @		requires id_emprestimo > 0;
	  @*/
    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }
    /*@	ensures id_cliente == \old(id_cliente);@*/
    public int getId_cliente() {
        return id_cliente;
    }
    /*
     *@	requires 0 < id_cliente;
     *@	ensures this.id_cliente == id_cliente;
      @*/
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    /*@	ensures id_livro == \old(id_livro);@*/
    public int getId_livro() {
        return id_livro;
    }
    /*
     *@	requires 0 < id_livro;
     *@	ensures this.id_livro == id_livro;
      @*/
    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }
    /*@	ensures data_emprestimo == \old(data_emprestimo);@*/
    public String getData_emprestimo() {
        return data_emprestimo;
    }
    /*
     *@	requires data_emprestimo != null;
     *@	ensures this.data_emprestimo == data_emprestimo;
      @*/
    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }
    /*@	ensures data_devolucao == \old(data_devolucao);@*/
    public String getData_devolucao() {
        return data_devolucao;
    }
    /*
     *@	requires data_devolucao != null;
     *@	ensures this.data_devolucao == data_devolucao;
      @*/
    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
    
}
