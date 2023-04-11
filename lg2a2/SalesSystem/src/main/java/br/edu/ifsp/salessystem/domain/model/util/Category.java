package br.edu.ifsp.salessystem.domain.model.util;

public enum Category {

    COSMESTIC(1L, 0.30),

    ELETRONIC(2L, 0.10),

    FURNITURE(3L, 0.05);


    private Long id;
    private double salesComission;

    Category(Long id, double comission) {
        this.id = id;
        this.salesComission = comission;
    }
}
