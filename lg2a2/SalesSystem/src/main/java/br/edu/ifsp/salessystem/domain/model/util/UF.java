package br.edu.ifsp.salessystem.domain.model.util;

import lombok.AllArgsConstructor;

public enum UF {

    SAO_PAULO("SP", 1L),
    RIO_DE_JANEIRO("RJ", 2L),
    MINAS_GERAIS("MG", 3L),
    CURITIBA("SC", 4L),
    PARANA("PR", 5L),
    RIO_GRANDE_DO_SUL("RS", 6L),
    CEARA("CE", 7L),
    PERNAMBUCO("PE",8L);


    private String federalUnity;
    private Long idZone;

    UF(String uf, Long id) {
        this.federalUnity = uf;
        this.idZone = id;
    }
}
