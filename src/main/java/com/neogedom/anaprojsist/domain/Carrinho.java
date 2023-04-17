package com.neogedom.anaprojsist.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Carrinho {
    private String id;
    private Double total;
    private List<Item> itens = new ArrayList<>();
    private Pedido pedido;

    public Carrinho(String id, Pedido pedido) {
        this.id = id;
        this.pedido = pedido;
        this.total = itens.stream().mapToDouble(Item::getSubTotal).sum();
    }

    public void criarItem() {
        Item novoItem = new Item(null, total, null, null);
    }
   
}
