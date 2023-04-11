package br.edu.ifsp.salessystem.domain.model.util;

public enum Categoria {

    COSMETICO(1L, 30.0),

    ELETRONICO(2L, 10.0),

    DECORACAO(3L, 5.0);


    private Long id;
    private double comissao;

    Categoria(Long id, double comissao) {
        this.id = id;
        this.comissao = comissao;
    }
}
