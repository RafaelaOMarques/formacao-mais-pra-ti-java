package br.com.exemplo.produto;

public class ProdutoComDesconto extends Produto {
    public ProdutoComDesconto(String nome, double preco, Integer quantidade) {
        super(nome, preco, quantidade);
    }

    public double desconto(double porcentagem, double preco){
        if(porcentagem > 50){
            throw new IllegalArgumentException("O Desconto não pode ser superior a 50%");
        } else {
            double desconto = preco * (porcentagem/100);
            System.out.println("O desconto foi de "+ desconto);
            this.setPreco(this.getPreco() - desconto);
        }
        return preco;
    }
}
