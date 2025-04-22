/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main7;

/**
 *
 * @author Admin
 */
public class Main7  extends ConfiguracaoSistema {

    public void exibirVersao() {
        System.out.println("Versão do sistema: " + versaoSistema);
    }

    public static void main(String[] args) {
        Main7 ss = new Main7();
        ss.exibirVersao();
    }
}
