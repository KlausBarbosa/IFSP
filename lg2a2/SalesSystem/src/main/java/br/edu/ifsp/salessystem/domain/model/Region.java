package br.edu.ifsp.salessystem.domain.model;

import javax.persistence.*;

@Entity
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
