package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

public abstract class Ave  extends Animal {
    
    public Ave (String nome, int idade) {
        super(nome, idade); 
    }
    
    @Override
    public void comer() {
    	System.out.println("A ave está bicando sementes ou insetos.");
    }
}