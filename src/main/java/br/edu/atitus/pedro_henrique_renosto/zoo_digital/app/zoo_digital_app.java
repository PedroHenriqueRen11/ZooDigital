package br.edu.atitus.pedro_henrique_renosto.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.corredor;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.nadador;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.predador;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.voador;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.aguia;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.animal;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.camaleao;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.cobra;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.golfinho;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.jacare;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.leao;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.pato;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.pinguim;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.salmao;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.tartaruga;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.tubarao;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais.urso;

public class zoo_digital_app {
    
    private static List<animal> animais = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        animais.add(new leao("Simba", 5));
        animais.add(new pinguim("Picolino", 2));
        animais.add(new jacare("Crocodilo", 15));
        animais.add(new aguia("Misty", 4));
        
        boolean rodando = true;
        
        while (rodando) {
            exibir_menu();
            int opcao = ler_opcao();
            
            switch (opcao) {
                case 1:
                    cadastrar_animal(); 
                    break;
                case 2:
                    listar_todos_animais(); 
                    break;
                case 3:
                	listar_por_comportamento(corredor.class, "corredor"); 
                    break;
                case 4:
                	listar_por_comportamento(nadador.class, "nadador"); 
                    break;
                case 5:
                	listar_por_comportamento(voador.class, "voador"); 
                    break;
                case 6:
                    listar_por_comportamento(predador.class, "predador");
                    break;
                case 7:
                    exibir_total_animais(); 
                    break;
                case 8: 
                    rodando = false;
                    System.out.println("Encerrando o Zoo Digital. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite um número de 1 a 8.");
            }
        }
        scanner.close(); 
    }
    
    private static void exibir_menu() {
        System.out.println("\n--- Zoo Digital CLI ---");
        System.out.println("1. Cadastrar Animal (leao, cobra, etc.)");
        System.out.println("2. Listar Todos Animais (Polimorfismo)");
        System.out.println("3. Listar Animais Corredores");
        System.out.println("4. Listar Animais Nadadores");
        System.out.println("5. Listar Animais Voadores");
        System.out.println("6. Listar Animais Predadores");
        System.out.println("7. Exibir Total de Animais");
        System.out.println("8. Sair");
        System.out.println("--------------------------");
        System.out.print("Escolha uma opção: ");
    }
    
    private static int ler_opcao() {
        try {
            String linha = scanner.nextLine();
            return Integer.parseInt(linha);
        } catch (NumberFormatException e) {
            return -1; 
        }
    }
   
    private static void cadastrar_animal() {
        System.out.println("\n--- Cadastro ---");
        System.out.println("Tipo de animal para cadastro (ex: leao, cobra, tubarao, aguia):");
        String tipo = scanner.nextLine();
        
        System.out.print("Nome do Animal: ");
        String nome = scanner.nextLine();
        
        System.out.print("Idade do Animal: ");
        int idade = ler_opcao(); 
        
        animal novo_animal = null;
        
        if (tipo.equalsIgnoreCase("leao")) {
            novo_animal = new leao(nome, idade);
        } else if (tipo.equalsIgnoreCase("urso")) {
        	novo_animal = new urso(nome, idade);
        } else if (tipo.equalsIgnoreCase("golfinho")) {
        	novo_animal = new golfinho(nome, idade);
        } else if (tipo.equalsIgnoreCase("aguia")) {
        	novo_animal = new aguia(nome, idade);
        } else if (tipo.equalsIgnoreCase("pato")) {
        	novo_animal = new pato(nome, idade);
        } else if (tipo.equalsIgnoreCase("pinguim")) {
        	novo_animal = new pinguim(nome, idade);
        } else if (tipo.equalsIgnoreCase("tubarao")) {
        	novo_animal = new tubarao(nome, idade);
        } else if (tipo.equalsIgnoreCase("salmao")) {
        	novo_animal = new salmao(nome, idade);
        } else if (tipo.equalsIgnoreCase("cobra")) {
        	novo_animal = new cobra(nome, idade);
        } else if (tipo.equalsIgnoreCase("jacare")) {
        	novo_animal = new jacare(nome, idade);
        } else if (tipo.equalsIgnoreCase("tartaruga")) {
        	novo_animal = new tartaruga(nome, idade);
        } else if (tipo.equalsIgnoreCase("camaleao")) {
        	novo_animal = new camaleao(nome, idade);
        } else {
            System.out.println("Tipo de animal inválido ou não suportado.");
            return;
        }
        
        animais.add(novo_animal);
        System.out.println("Animal " + nome + " cadastrado com sucesso!");
    }

    private static void listar_todos_animais() {
        System.out.println("\n--- Lista Completa de Animais ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        
        for (animal a : animais) {
            a.exibir_detalhes(); 
            a.emitir_som();     
            a.comer();         
            System.out.println("-------------------------------");
        }
    }

    private static void listar_por_comportamento(Class<?> interface_tipo, String tipo_comportamento) {
        System.out.println("\n--- Lista de Animais " + tipo_comportamento + "es ---");
        boolean encontrado = false;
        
        for (animal a : animais) {
            
            if (interface_tipo.isInstance(a)) {
                a.exibir_detalhes();
                
                if (a instanceof corredor) {
                    ((corredor) a).correr();
                } 
                if (a instanceof nadador) {
                    ((nadador) a).nadar();
                } 
                if (a instanceof voador) {
                    ((voador) a).voar();
                } 
                if (a instanceof predador) {
                    ((predador) a).cacar();
                }
                System.out.println("--------------------");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("Nenhum animal com o comportamento " + tipo_comportamento + " encontrado.");
        }
    }

    private static void exibir_total_animais() {
        System.out.println("\n--- Total de Animais Cadastrados ---");
        System.out.println("Total: " + animal.get_contador()); 
    }
}