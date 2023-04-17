package com.neogedom.anaprojsist.domain;

import lombok.Data;

@Data
public class Item {
    private Integer quantidade;
    private Double precoUnitario;
    private Double subTotal;
    private Livro livro;

    public Item(Integer quantidade, Double precoUnitario, Livro livro, Carrinho carrinho) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.subTotal = quantidade * precoUnitario;
        this.livro = livro;
    }
    
    
}
