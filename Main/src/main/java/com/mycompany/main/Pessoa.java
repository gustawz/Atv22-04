/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;



public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("O Nome: " + getNome());
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 1) {
            this.idade = idade;
            System.out.println("Idade:" + getIdade());
        } else {
            System.out.println("Idade: Invalida");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            this.cpf = cpf;
            System.out.println("CPF: " + getCpf());
        } else {
            System.out.println("CPF: Invalido");
        }
    }

}
