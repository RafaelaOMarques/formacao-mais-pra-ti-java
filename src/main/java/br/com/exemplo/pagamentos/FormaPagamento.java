package br.com.exemplo.pagamentos;

public abstract  class FormaPagamento {
    public  abstract void processarPagamento(double valor);

    public  abstract void validarPagamento();
}
