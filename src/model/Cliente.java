
package model;


public class Cliente {
    

    private /*@ spec_public nullable @*/ int id;
    private /*@ spec_public nullable @*/ String nome;
    private /*@ spec_public nullable @*/ String dataNasc;
    private /*@ spec_public nullable @*/ String sexo;
    private /*@ spec_public nullable @*/ String cpf;
    private /*@ spec_public nullable @*/ String endereco;
    private /*@ spec_public nullable @*/ String fone;

	//@ public initially id == 0;
    /*@ public constraint 
	  @ 	this.id == \old(this.id) || 0 == \old(this.id);
   	*/
    
    public Cliente(String nome, String dataNasc, String sexo, String cpf, String endereco, String fone) {
        setFone(fone);
        setEndereco(endereco);
        setCpf(cpf);
        setSexo(sexo);
        setDataNasc(dataNasc);
        setNome(nome);
    }
    
    public Cliente() {
    }  
    
    // @ assignable \nothing
    public int getId() {
        return id;
    }
    
    /*@	requires id >= 0;
	  @ ensures this.id == id; 
	  @ assignable this.id;
	  @ also
	  @ 	requires id < 0;
	  @ 	assignable \nothing;
	  @ 	ensures this.id == \old(this.id);
	@*/
    public void setId(int id) {
        this.id = id;
    }    
    
    // @ assignable \nothing
    public String getNome() {
        return nome;
    }
    
	/*@	requires nome != null && !nome.equals("");
	  @ ensures this.nome == nome; 
	  @ assignable this.nome;
	  @ also
	  @ 	requires nome.equals("");
	  @ 	assignable \nothing;
	  @ 	ensures this.nome == \old(this.nome);
	@*/
    public void setNome(String nome) {
    	if(!nome.equals("")) {
    		this.nome = nome;
    	}
    }
    
    // @ assignable \nothing
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
    
    // @ assignable \nothing 
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
    
    // @ assignable \nothing
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
