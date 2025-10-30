package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import org.apache.commons.lang3.StringUtils; 

public abstract class Animal {
    private static int contador = 0; 
    
    private String nome;
    private int idade;
    
    public Animal(String nome, int idade) {
        this.nome = StringUtils.capitalize(nome); 
        this.idade = idade;
        Animal.contador++;
    }
    
    public abstract void emitirSom();
    public abstract void comer();

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public static int getContador() { return contador; }

    public void exibirDetalhes() {
        System.out.printf("Nome: %s, Idade: %d, Espécie: %s\n", this.nome, this.idade, this.getClass().getSimpleName());
    }
}