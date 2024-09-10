package br.com.exemplo.pagamentos;

import br.com.exemplo.utils.shared.ChavePix;

public class Pix extends FormaPagamento{
    public double saldoConta;
    public ChavePix chavePix;
    public Pix(double saldoConta, ChavePix chavePix){
        this.saldoConta = saldoConta;
        this.chavePix = chavePix;
    }
    @Override
    public void processarPagamento(double valor) {
        if(saldoConta > valor){
            System.out.println("Saldo suficiente para realizar o Pix");
        }
    }

    @Override
    public void validarPagamento() {
        if(chavePix == ChavePix.TELEFONE || chavePix == ChavePix.CPF || chavePix == ChavePix.EMAIL){
            System.out.println("Chave Pix é válida");
        }

    }
}
