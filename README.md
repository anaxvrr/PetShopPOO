# 🐾 Sistema de Gestão de Animais - Pet Shop

Este projeto foi desenvolvido para simular um sistema de gestão de um Pet Shop utilizando os princípios da **Programação Orientada a Objetos (POO)** em **Java**.

## 📌 Objetivo

Gerenciar serviços oferecidos para diferentes tipos de animais (Cachorro, Gato e Pássaro), como:
- Banho
- Tosa
- Consulta veterinária

Cada tipo de animal possui **valores diferentes** para cada serviço.

## 🛠️ Tecnologias Utilizadas

- Linguagem Java
- Programação Orientada a Objetos (POO)
  - Herança
  - Polimorfismo
  - Encapsulamento

## 📂 Estrutura do Projeto

- `Animal.java`: Classe abstrata base para todos os animais.
- `Cachorro.java`, `Gato.java`, `Passaro.java`: Subclasses que herdam de `Animal`.
- `PetShop.java`: Classe que gerencia os animais e os serviços.
- `Main.java`: Classe principal com exemplos de uso do sistema.

## 🚫 Regras de Negócio

- A idade do animal não pode ser negativa.
- Nem todos os serviços estão disponíveis para todos os tipos de animais.

## 📦 Como Executar

1. Compile todos os arquivos `.java`:
```bash
javac *.java
```

2. Execute a classe principal:
```bash
java Main
```

## 👥 Desenvolvido por

> Projeto feito para fins acadêmicos.