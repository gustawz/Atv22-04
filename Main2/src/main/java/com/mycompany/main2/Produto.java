/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main2;

/**
 *
 * @author Admin
 */
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Produto: " + getNome());
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 1) {
            this.preco = preco;
            System.out.println("Preço: " + getPreco());
        } else {
            System.out.println("Preço: Invalido");
        }
    }

    public int getQnt() {
        return quantidade;
    }

    public void setQnt(int quantidade) {
        this.quantidade = quantidade;
        System.out.println("quantidade: " + getQnt());
    }

}
