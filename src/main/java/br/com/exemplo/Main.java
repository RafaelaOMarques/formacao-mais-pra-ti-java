package br.com.exemplo;

import br.com.exemplo.animal.Animal;
import br.com.exemplo.animal.Cachorro;
import br.com.exemplo.animal.Gato;
import br.com.exemplo.animal.Vaca;
import br.com.exemplo.funcionario.Desenvolvedor;
import br.com.exemplo.funcionario.Gerente;
import br.com.exemplo.produto.Produto;
import br.com.exemplo.produto.ProdutoComDesconto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("boneca", 59.90, 5);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreco());
        System.out.println(produto1.getQuantidade());
        produto1.setNome("Boneca Barbie");
        produto1.setPreco(-109.90);
        produto1.setQuantidade(-15);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getPreco());


        System.out.println("--------------------------------------");
        ProdutoComDesconto produtoComDesconto = new ProdutoComDesconto("Fogão", 3000.00, 2);
        System.out.println("O produto "+ produtoComDesconto.getNome() + " tem o preço de " + produtoComDesconto.getPreco());
        produtoComDesconto.desconto(10, produtoComDesconto.getPreco());
        System.out.println("O valor atualizado do "+ produtoComDesconto.getNome() + " é de R$ " + produtoComDesconto.getPreco());


        System.out.println("--------------------------------------");
        Gerente gerente1 = new Gerente("Jacques", 15000);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Rafaela", 5000);
        gerente1.calcularBonus(20);
        desenvolvedor1.calcularBonus(10);
        System.out.println("O Salario do gerente "+ gerente1.nome + " é de R$ "+ gerente1.salario + " e o seu bonus é de R$ "+gerente1.bonus);
        System.out.println("O Salario da desenvolvedora "+ desenvolvedor1.nome +  " é de R$ "+ desenvolvedor1.salario + " e o seu bonus é de R$ "+desenvolvedor1.bonus);
        System.out.println(gerente1.trabalhar());
        System.out.println(desenvolvedor1.trabalhar());

        System.out.println("-----------Exercício 6--------------");
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        for(Animal animal : animais){
            animal.emitirSom();
        }
    }
}