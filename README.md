# 🐘 Zoo Digital (Projeto de Programação Orientada a Objetos)

O **Zoo Digital** é uma aplicação de linha de comando (CLI) desenvolvida em Java, utilizando o Maven. O projeto foi criado com o objetivo de demonstrar a aplicação prática dos pilares da **Programação Orientada a Objetos (POO)**.

O código segue integralmente o padrão de nomenclatura **snake_case** (`snake_case`) para pacotes, classes, métodos e variáveis, conforme requisito.

## 🛠️ Tecnologias e Implementação

* **Linguagem:** Java (JDK 17+)
* **Gerenciador de Dependências:** Apache Maven

## 💡 Conceitos de POO Aplicados

| Conceito | Aplicação no Projeto |
| :--- | :--- |
| **Classes Abstratas e Herança** | A classe base `animal` define o comportamento geral, sendo herdada por classes mais específicas como `mamifero`, `ave`, `peixe` e `reptil`. |
| **Interfaces** | Comportamentos dinâmicos como `corredor`, `nadador`, `voador` e `predador` são definidos como interfaces, permitindo que os animais possuam múltiplos comportamentos (ex: um `pinguim` é `nadador` e `corredor`). |
| **Polimorfismo** | O sistema lista e interage com todos os animais através do tipo base `animal`, mas cada animal executa sua própria versão dos métodos (`emitirSom`, `comer`). |

## 📋 Funcionalidades

O sistema de menu de linha de comando (CLI) permite:

1.  **Cadastrar Animais:** Criando novas instâncias de classes de animais (ex: `leao`, `tubarao`).
2.  **Listar Todos:** Exibir detalhes de todos os animais cadastrados, demonstrando o Polimorfismo.
3.  **Filtrar por Comportamento:** Listar apenas os animais que possuem uma interface específica (ex: todos os `predador`es).
4.  **Contagem Total:** Exibir o número total de animais cadastrados (demonstração de membros estáticos).

---
*Desenvolvido por: Pedro Henrique Renosto*
