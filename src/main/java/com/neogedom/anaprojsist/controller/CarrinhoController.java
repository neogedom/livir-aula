package com.neogedom.anaprojsist.controller;

import com.neogedom.anaprojsist.domain.Carrinho;
import com.neogedom.anaprojsist.domain.types.ISBN;
import com.neogedom.anaprojsist.domain.types.NonNegativeInteger;


public class CarrinhoController {
    
    public void adicionarAoCarrinho(String umIdDeCarrinho, ISBN umISBN, NonNegativeInteger quantidade) {
        
         // Posso instanciar Carrinho ou uma classe de Serviço de carrinho
        Carrinho umCarrinho = getCarrinho(umIdDeCarrinho);
        umCarrinho.criarItem();
    }

    public Carrinho getCarrinho(String id) {
        return new Carrinho(id, null);
    }
}
