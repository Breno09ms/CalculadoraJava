/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora.controle;

import com.mycompany.calculadora.enums.EnumOperacao;

/**
 *
 * @author brenin
 */
public class CalcControladora {
    private Double total;
    private Double ultimoValor; // Adicione esta variável

    public CalcControladora() {
        total = 0.0;
        ultimoValor = 0.0; // Inicializa o último valor
    }

    public double RealizarOperacao(EnumOperacao operacao, double a, double b) {
    switch (operacao) {
        case SOMA: return a + b;
        case SUBTRACAO: return a - b;
        case MULTIPLICACAO: return a * b;
        case DIVISAO: return b != 0 ? a / b : 0; // Divisão segura
        default: return b;
    }
}


    public double getTotal() {
        return this.total;
    }

    public void zerar() {
        total = 0.0;
        ultimoValor = 0.0; // Reseta o último valor
    }
}