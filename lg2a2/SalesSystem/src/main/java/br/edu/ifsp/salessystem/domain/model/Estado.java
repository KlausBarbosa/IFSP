package br.edu.ifsp.salessystem.domain.model;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;


@Entity
public class Estado {

    @NotNull
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false)
    private String nome;
}
