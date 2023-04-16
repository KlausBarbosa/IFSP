package br.edu.ifsp.salessystem.domain.model;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;


@Entity
public class State {

    @NotNull
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(nullable = false, name = "state_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;
}
