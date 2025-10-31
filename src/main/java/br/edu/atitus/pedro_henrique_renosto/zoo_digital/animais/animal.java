package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import org.apache.commons.lang3.StringUtils; 

public abstract class animal {
    private static int contador = 0; 
    
    private String nome;
    private int idade;
    
    public animal(String nome, int idade) {
        this.nome = StringUtils.capitalize(nome); 
        this.idade = idade;
        animal.contador++;
    }
    
    public abstract void emitir_som();
    public abstract void comer();

    public String get_nome() { return nome; }
    public int geticdade() { return idade; }
    public static int get_contador() { return contador; }

    public void exibir_detalhes() {
        System.out.printf("Nome: %s, Idade: %d, Espécie: %s\n", this.nome, this.idade, this.getClass().getSimpleName());
    }
}