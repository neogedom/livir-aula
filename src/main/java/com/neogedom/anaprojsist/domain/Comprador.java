package com.neogedom.anaprojsist.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neogedom.anaprojsist.domain.types.CPF;
import lombok.Data;

@Data
public class Comprador {
    private CPF cpf;
    private String nome;
    private Date dataDeNascimento;
    private List<Pedido> pedidos = new ArrayList<>();
}
