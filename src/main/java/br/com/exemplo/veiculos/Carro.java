package br.com.exemplo.veiculos;

import br.com.exemplo.utils.shared.IMeioTransporte;

public class Carro implements IMeioTransporte {
    public String modelo;
    public String cor;
    public int anoFabricacao;
    public int velocidade;

    @Override
    public void acelerar() {
        this.velocidade = this.velocidade+10;

    }

    @Override
    public void frear() {
        this.velocidade = 0;

    }

}
