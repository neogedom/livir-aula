package com.neogedom.anaprojsist.domain;

import com.neogedom.anaprojsist.domain.types.ISBN;
import com.neogedom.anaprojsist.domain.types.NonNegativeInteger;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @EqualsAndHashCode @ToString
public class Livro {
    private ISBN isbn;
    private String titulo;
    private String nomeDosAutores;
    @Setter private Double preco;
    private Integer numeroDePaginas;
    private NonNegativeInteger quantidadeEmEstoque;
    private String nomeDaEditora;
    private String imagemDeCapa;
    private Editora editora;

    public Livro (Editora editora)
    {
       this.nomeDaEditora = editora.getNome();
    }

    public Livro(ISBN isbn, String titulo, String nomeDosAutores, Double preco, Integer numeroDePaginas,
            NonNegativeInteger quantidadeEmEstoque, String imagemDeCapa, Editora editora) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.nomeDosAutores = nomeDosAutores;
        this.preco = preco;
        this.numeroDePaginas = numeroDePaginas;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.imagemDeCapa = imagemDeCapa;
        this.editora = editora;
        this.nomeDaEditora = editora.getNome();
    }

    
}
