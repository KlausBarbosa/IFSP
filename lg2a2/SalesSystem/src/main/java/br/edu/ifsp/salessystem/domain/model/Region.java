package br.edu.ifsp.salessystem.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private Zone[] zones;

    @OneToOne
    private Vendor regionRepresentative;
}
