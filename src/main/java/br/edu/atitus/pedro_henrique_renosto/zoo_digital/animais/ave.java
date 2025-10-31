package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

public abstract class ave  extends animal {
    
    public ave (String nome, int idade) {
        super(nome, idade); 
    }
    
    @Override
    public void comer() {
    	System.out.println("A ave está bicando sementes ou insetos.");
    }
}