package br.com.exemplo.funcionario;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus(double percentual) {
        return super.calcularBonus(percentual);
    }

    @Override
    public String trabalhar() {
        String trabalho = "Meu trabalho é quebrar o sistema (kkkkk)";
        return trabalho;
    }
}
