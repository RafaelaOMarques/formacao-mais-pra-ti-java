package br.com.exemplo.produto;

public class Produto {

    private String nome;
    private double preco;
    private Integer quantidade;

    public Produto(String nome, double preco, Integer quantidade) {
        if(preco > 0){
            this.preco = preco;

        }
        if(quantidade > 0){
            this.quantidade = quantidade;

        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        if(nome.isEmpty()){
            this.nome = nome;
        }
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
        }
        return preco;

    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Integer setQuantidade(Integer quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;

        }
        return quantidade;

    }
}
