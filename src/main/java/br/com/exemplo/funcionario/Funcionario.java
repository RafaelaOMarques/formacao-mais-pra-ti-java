package br.com.exemplo.funcionario;

public class Funcionario {

    public String nome;
    public double salario;
    public double bonus = 0;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus(double percentual){
        this.bonus = this.salario * (percentual/100);
        return this.bonus;
    };

    public String trabalhar(){
        String trabalho = "O trabalho dignifica o homem";
        return trabalho;
    };
}
