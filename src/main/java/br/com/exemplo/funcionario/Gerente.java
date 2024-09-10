package br.com.exemplo.funcionario;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus(double percentual) {
        return super.calcularBonus(percentual);
    }

    @Override
    public String trabalhar() {
        String trabalho = "Meu trabalho é atrapalhar os DEVs (kkkkk)";
        return trabalho;
    }
}
