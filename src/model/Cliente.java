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
public class Cliente {
    
    private int id;
    private String nome;
    private String dataNasc;
    private String sexo;
    private String cpf;
    private String endereco;
    private String fone;
    
    
    
    public Cliente(String nome, String dataNasc, String sexo, String cpf, String endereco, String fone) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.fone = fone;
    }
    
     public Cliente() {
    }  
    /*@public invariant 0 < id;*/
     
    /*@ id == old(id)@*/
    public int getId() {
        return id;
    }
    /*
     *@	requires 0 < id;
     *@	ensures this.id == id;
      @*/
    public void setId(int id) {
        this.id = id;
    }    
    /*@ ensures nome == old(nome);
     *@*/
    public String getNome() {
        return nome;
    }
    /*
     *@	requires nome != null;
     *@	ensures this.nome == nome;
      @*/
    public void setNome(String nome) {
        this.nome = nome;
    }
    /*@	ensures dataNasc == old(dataNasc);@*/
    public String getDataNasc() {
        return dataNasc;
    }
    /*
     *@	requires dataNasc != null;
     *@	ensures this.dataNasc == dataNasc;
      @*/
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    /*@ensures sexo == old(sexo);*/
    public String getSexo() {
        return sexo;
    }
    /*
     *@	requires sexo == 'M' || sexo == 'F';
     *@	ensures this.sexo == sexo;
      @*/
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /*@ensures cpf == old(cpf);*/
    public String getCpf() {
        return cpf;
    }
    /*
     *@	requires cpf != null;
     *@	ensures this.cpf == cpf;
      @*/
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    /*@	ensures endereco == old(endereco);@*/
    public String getEndereco() {
        return endereco;
    }
    /*
     *@	requires endereco != null;
     *@	ensures this.endereco == endereco;
     *@
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    /*@	ensures fone == old(fone);@*/
    public String getFone() {
        return fone;
    }
    /*
     *@	requires fone != null
     *@	ensures this.fone == fone
      @*/
    public void setFone(String fone) {
        this.fone = fone;
    }  
    
}
