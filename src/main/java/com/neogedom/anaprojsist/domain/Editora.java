package com.neogedom.anaprojsist.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Editora {
    private String nome;
    private List<Livro> livros = new ArrayList<>();
}
