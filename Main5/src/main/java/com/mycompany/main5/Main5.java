/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main5;

/**
 *
 * @author Admin
 */
public class Main5 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456", "João");
        conta.depositar(1000);
        conta.sacar(500);
        conta.sacar(600); // Testa saque acima do saldo
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}
