package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

public abstract class Peixe extends Animal {
    
    public Peixe (String nome, int idade) {
        super(nome, idade); 
    }
    
    @Override
    public void comer() {
    	System.out.println("O peixe engole sua comida sem mastigar.");
    }
}