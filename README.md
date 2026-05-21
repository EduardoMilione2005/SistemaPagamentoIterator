# Sistema de Pagamento - Padrão Iterator

## Descrição do Projeto
Este projeto implementa o **Padrão de Projeto Iterator** em Java com o tema **Sistema de Pagamento**.

O sistema permite armazenar diferentes formas de pagamento e percorrê-las utilizando um iterador, sem expor a estrutura interna da coleção.

---

## Objetivo
Demonstrar a aplicação do padrão de projeto **Iterator**, permitindo que os pagamentos sejam percorridos de maneira padronizada.

---

## Tecnologias Utilizadas
- Java
- IntelliJ IDEA
- Maven (opcional)

---

## Estrutura do Projeto

```plaintext
SistemaPagamentoIterator/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       │── Main.java
│   │       │
│   │       └── com/
│   │           └── pagamento/
│   │               ├── model/
│   │               │   └── Pagamento.java
│   │               │
│   │               ├── iterator/
│   │               │   ├── PagamentoIterator.java
│   │               │   └── ListaPagamentoIterator.java
│   │               │
│   │               └── collection/
│   │                   ├── PagamentoCollection.java
│   │                   └── ListaPagamentos.java
│   │
│   └── test/
│       └── java/
│           └── com/pagamento/
│               └── ListaPagamentosTest.java
│
└── pom.xml
