
package model;


public class Cliente {
    

    private /*@ spec_public nullable @*/ int id;
    private /*@ spec_public nullable @*/ String nome;
    private /*@ spec_public nullable @*/ String dataNasc;
    private /*@ spec_public nullable @*/ String sexo;
    private /*@ spec_public nullable @*/ String cpf;
    private /*@ spec_public nullable @*/ String endereco;
    private /*@ spec_public nullable @*/ String fone;


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

    public int getId() {
        return id;
    }
    
 	/*@ public constraint 
	  @ 	this.id == \old(this.id) || 0 == \old(this.id);
	  @		requires id > 0;
	  @*/
    public void setId(int id) {
        this.id = id;
    }    
   
    public String getNome() {
        return nome;
    }
    
    /*
     @	requires nome != null;
     @	ensures this.nome == nome;
     @ */
    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public String getDataNasc() {
        return dataNasc;
    }
    
    /*
     @	requires dataNasc != null;
     @	ensures this.dataNasc == dataNasc;
     @*/
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    /*
     @	requires sexo == 'M' || sexo == 'F';
     @	ensures this.sexo == sexo;
     @*/
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }
    
    /*
     @	requires cpf != null;
     @	ensures this.cpf == cpf;
     @*/
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /*	ensures endereco == old(endereco); */
    public String getEndereco() {
        return endereco;
    }
    
    /*
     @	requires endereco != null;
     @	ensures this.endereco == endereco;
     @
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    /*	ensures fone == old(fone);*/
    public String getFone() {
        return fone;
    }
    /*
     @	requires fone != null
     @	ensures this.fone == fone
     @*/
    public void setFone(String fone) {
        this.fone = fone;
    }  
    
}
