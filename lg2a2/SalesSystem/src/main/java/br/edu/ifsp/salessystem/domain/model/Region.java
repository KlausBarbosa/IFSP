package br.edu.ifsp.salessystem.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "region_name")
    private String name;

    @OneToMany
    private Zone[] zones;

    @OneToOne
    private Vendor regionRepresentative;

    @OneToMany
    private List<State> states;

}
