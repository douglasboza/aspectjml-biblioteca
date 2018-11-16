/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author paulojp
 */
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
//   	  this.id = id;
//        this.exemplar = exemplar;
//        this.autor = autor;
//        this.edicao = edicao;
//        this.ano = ano;
//        this.disponibilidade = disponibilidade;
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

    public String getExemplar() {
        return exemplar;
    }
    
	/*@ ensures exemplar == this.exemplar; 
	@*/
    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getAutor() {
        return autor;
    }
    
	/*@ ensures autor == this.autor; 
	@*/
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public byte getEdicao() {
        return edicao;
    }
    
    
	/*@ requires edicao >= 0;
	  @	ensures id == this.id; 
	@*/
    public void setEdicao(byte edicao) {
        this.edicao = edicao;
    }

    public short getAno() {
        return ano;
    }
	//	

	/*@ requires ano > 0;
	  @	ensures this.ano == ano; 
	@*/
    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }
    
	/*@ ensures disponibilidade == this.disponibilidade; 
	@*/
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }    
}

