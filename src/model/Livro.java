
package model;


public class Livro {

    private /*@ spec_public @*/ int id;    
    private /*@ spec_public nullable @*/ String exemplar;
    private /*@ spec_public nullable @*/ String autor;
    private /*@ spec_public nullable @*/ byte edicao;
    private /*@ spec_public nullable @*/ short ano;
    private /*@ spec_public nullable @*/ String disponibilidade;
        

    public Livro(int id, String exemplar, String autor, byte edicao, short ano, String disponibilidade) {
       	setId(id);
       	setAutor(autor);
       	setExemplar(exemplar);
       	setEdicao(edicao);
       	setAutor(autor);
       	setDisponibilidade(disponibilidade);
    }
    

    public Livro() {
    }   
    
    public int getId() {
        return id;
    }

	/*@ public constraint 
	  @ 	this.id == \old(this.id) || 0 == \old(this.id);
	  @	requires id > 0;
	  @*/
    public void setId(int id) {
        this.id = id;
    }

    

	/*@	requires exemplar != null && !exemplar.equals("");
	  @ ensures this.exemplar == exemplar; 
	  @ assignable this.exemplar;
	  @ also
	  @ 	requires exemplar.equals("");
	  @ 	assignable \nothing;
	  @ 	ensures this.exemplar == \old(this.exemplar);
	@*/
    public void setExemplar(String exemplar) {
    	if(!exemplar.equals("")){
    		this.exemplar = exemplar;
    	}
    }
    
	// @ assignable \nothing
    public String getExemplar() {
        return exemplar;
    }
   
    // @ assignable \nothing
    public String getAutor() {
        return autor;
    }
    
	/*@	requires autor != null && !autor.equals("");
	  @ ensures this.autor == autor; 
	  @ assignable this.autor;
	  @ also
	  @ 	requires autor.equals("");
	  @ 	assignable \nothing;
	  @ 	ensures this.autor == \old(this.autor);
	@*/
    public void setAutor(String autor) {
    	if(!autor.equals("")){
    		this.autor = autor;
    	}
    }
    
    // @ assignable \nothing
    public byte getEdicao() {
        return edicao;
    }
    
    /*@	requires edicao >= 0;
	  @ ensures this.edicao == edicao; 
	  @ assignable this.edicao;
	@*/
    public void setEdicao(byte edicao) {
    	this.edicao = edicao;
    }
    
    // @ assignable \nothing
    public short getAno() {
        return ano;
    }

	/*@ requires ano > 0;
	  @	ensures this.ano == ano; 
	  @ assignable this.ano;
	  @ also
	  @ 	requires ano < 0;
  	  @ 	assignable \nothing;
	  @ 	ensures this.ano == \old(this.ano);
	@*/
    public void setAno(short ano) {
    	if(ano > 0){   	
    		this.ano = ano;
    	}
    }
    
    // @ assignable \nothing
    public String getDisponibilidade() {
        return disponibilidade;
    }
    
    /*@	requires disponibilidade != null && !disponibilidade.equals("");
	  @ ensures this.disponibilidade == disponibilidade; 
	  @ assignable this.autor;
	  @ also
	  @ 	requires disponibilidade.equals("");
	  @ 	assignable \nothing;
	  @ 	ensures this.disponibilidade == \old(this.disponibilidade);
	@*/
    public void setDisponibilidade(String disponibilidade) {
    	if(!disponibilidade.equals("")){
    		this.disponibilidade = disponibilidade;
    	}
    }    
}



