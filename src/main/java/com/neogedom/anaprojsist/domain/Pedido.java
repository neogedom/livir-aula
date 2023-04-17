package com.neogedom.anaprojsist.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Pedido {

    private Date data;
    private Integer numero;
    private Double total;
    private Carrinho carrinho;
    private Comprador comprador;

    public Pedido(Date data, Integer numero, Carrinho carrinho, Comprador comprador) {
        this.data = data;
        this.numero = numero;
        this.carrinho = carrinho;
        this.comprador = comprador;
        this.total = carrinho.getTotal();
    }

    
}
