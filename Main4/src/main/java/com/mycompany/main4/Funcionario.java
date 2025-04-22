/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main4;

/**
 *
 * @author Admin
 */
public class Funcionario {
        private String nome;
        private double salario;
        private String cargo;
    
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
            System.out.println("Nome: " + getNome());
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            if (salario >= 1412.00) {
                this.salario = salario;
                System.out.println("Salario:R$ " + getSalario());
            } else {
                System.out.println("Salario: Invalido");
            }
        }

        public String getCargo() {
            return cargo;
        }
        
        public void setCargo(String cargo) {
            this.cargo = cargo;
            System.out.println("Cargo: " + getCargo());
        }
}