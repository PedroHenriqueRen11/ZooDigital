package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

public abstract class peixe extends animal {
    
    public peixe (String nome, int idade) {
        super(nome, idade); 
    }
    
    @Override
    public void comer() {
    	System.out.println("O peixe engole sua comida sem mastigar.");
    }
}