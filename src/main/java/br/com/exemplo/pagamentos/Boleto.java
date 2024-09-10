package br.com.exemplo.pagamentos;

public class Boleto extends FormaPagamento{
    public double valorBoleto;

    public Boleto(double valorBoleto){
        this.valorBoleto = valorBoleto;
    }
    @Override
    public void processarPagamento(double valor) {
        if(valorBoleto < valor){
            System.out.println("O valor apresentado é suficiente para a quitação do boleto");
        }
    }

    @Override
    public void validarPagamento() {

    }
}
