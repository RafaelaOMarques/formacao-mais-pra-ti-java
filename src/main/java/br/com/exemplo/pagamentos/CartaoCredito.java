package br.com.exemplo.pagamentos;

public class CartaoCredito extends FormaPagamento{
    public double limite;
    private String numeroCartao;

    public CartaoCredito(double limite, String numeroCartao){
        this.limite =  limite;
        this.numeroCartao = numeroCartao;
    }

    public CartaoCredito(double limite){
        this.limite=limite;
    }
    @Override
    public void processarPagamento(double valor) {
        if(limite > valor){
            System.out.println("Pagamento processado com sucesso");
        }
    }

    @Override
    public void validarPagamento() {
        if(numeroCartao.length() == 16){
            System.out.println("Cartão Válido");
        };

    }
}
