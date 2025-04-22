/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main6;

/**
 *
 * @author Admin
 */
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota1 = nota;
        } else {
            System.out.println("Nota 1 inválida.");
        }
    }

    public void setNota2(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota2 = nota;
        } else {
            System.out.println("Nota 2 inválida.");
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 6;
    }
}
