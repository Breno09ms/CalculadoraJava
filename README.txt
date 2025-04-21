# Calculadora Java com Interface Gráfica (Swing)

Este projeto é uma calculadora desenvolvida em Java utilizando a biblioteca Swing para a interface gráfica. A calculadora permite realizar operações básicas como adição, subtração, multiplicação e divisão.

## 📁 Estrutura do Projeto

O projeto segue a estrutura padrão do NetBeans (Maven) com as seguintes pastas principais:

```
Calculadora/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── calculadora/
│                       ├── Calculadora.java
│                       ├── InterfaceCalc.java
│                       ├── CalcControladora.java
│                       └── EnumOperacao.java
├── target/
│   └── Calculadora-1.0-SNAPSHOT.jar
├── pom.xml
└── README.md
```

## 🚀 Funcionalidades

- Interface gráfica com botões de 0 a 9 e operações básicas (+, -, ×, ÷).
- Botão de limpar (`CLEAR`) que reseta a calculadora.
- Exibe o resultado na tela após clicar em `=`.
- Controle de fluxo das operações utilizando um enum (`EnumOperacao`).
- Arquitetura separada em classes:
  - `Calculadora.java` – classe principal.
  - `InterfaceCalc.java` – interface gráfica.
  - `CalcControladora.java` – lógica de cálculo.
  - `EnumOperacao.java` – enumeração das operações.

## 🧮 Exemplos de uso

- **5 + 2 =** → Resultado: `7`
- **10 ÷ 2 =** → Resultado: `5`
- **5 × 2 + 1 =** → Resultado: `11`  
  (respeita a ordem de entrada, como uma calculadora simples)



## 📌 Observações

- O campo de entrada sempre exibe o número atual digitado.
- O campo é limpo após cada operação, mas mantém o último valor visualmente, evitando confusão.
- O botão `=` calcula com base na última operação selecionada.

## 📄 Licença

Este projeto é apenas para fins educacionais. Sinta-se livre para usar, modificar e melhorar!