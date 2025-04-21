/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author brenin
 */
public class Calculadora {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalc().setVisible(true);
            }
        });
    }
}
