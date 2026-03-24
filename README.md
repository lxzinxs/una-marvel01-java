# 🛡️ Exercícios de Lógica: Condicionais e Operadores em Java

Este repositório contém dois projetos práticos desenvolvidos em sala de aula. O foco destas atividades foi aplicar estruturas de decisão (`if/else`), operadores lógicos e a manipulação de entrada de dados via terminal.

---

## 📂 Descrição dos Projetos

### 1. 🪖 Sistema de Triagem de Alistamento (`Alistamento.java`)
Um programa interativo que avalia os dados físicos de um recruta para determinar sua aptidão.
* **Funcionalidade:** O sistema solicita o nome, peso e altura do usuário. Ele realiza o cálculo do **IMC (Índice de Massa Corporal)** e avalia se o peso está dentro da faixa aceitável para o alistamento (entre 50kg e 100kg).
* **Conceitos Aplicados:**
  * Uso da classe `Scanner` para interagir com o usuário e ler dados do tipo `String` e `double`.
  * Operações matemáticas avançadas utilizando `Math.pow()` para elevar a altura ao quadrado.
  * Estruturas de controle `if / else if / else`.
  * Boa prática: Fechamento do leitor com `teclado.close()` para evitar vazamento de memória.

### 2. ⚔️ Projeto Renascimento (`projetoRenascimento.java`)
Um algoritmo de validação de status que simula os requisitos de um jogo ou desafio.
* **Funcionalidade:** Valida se o usuário tem os atributos mínimos para prosseguir: é necessário ter coragem e uma saúde física superior a 30 pontos.
* **Conceitos Aplicados:**
  * Declaração de variáveis booleanas (`boolean`) e inteiras (`int`).
  * Utilização do operador lógico **AND (`&&`)** para garantir que duas condições sejam obrigatoriamente verdadeiras ao mesmo tempo.

---

## 💻 Tecnologias Utilizadas

* **Linguagem:** Java
* **Bibliotecas Nativas:** `java.util.Scanner`, `java.lang.Math`

---

## ⚙️ Como Executar no Terminal

Certifique-se de ter o **JDK (Java Development Kit)** instalado.

1. Abra o terminal na pasta onde os arquivos estão localizados.
2. Compile o código fonte desejado:
   ```bash
   javac Alistamento.java
   ```
3. Rode a aplicação gerada:
   ```bash
   java Alistamento
   ```

---
**Desenvolvido por Lucas Nery Miranda** *Estudante de Ciência da Computação - Universidade UNA (Contagem)*
