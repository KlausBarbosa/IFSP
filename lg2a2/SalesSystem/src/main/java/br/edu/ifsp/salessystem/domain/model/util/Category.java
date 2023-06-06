package br.edu.ifsp.salessystem.domain.model.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum Category {

    COSMESTIC(1L, 0.30),

    ELETRONIC(2L, 0.10),

    FURNITURE(3L, 0.05);


    private Long id;
    private double salesComission;


    public static Category findCategory(Long idCategory) {
            return Arrays.stream(Category.values())
                    .filter(e -> e.getId().equals(idCategory))
                    .findFirst().orElseThrow();
    }
}
