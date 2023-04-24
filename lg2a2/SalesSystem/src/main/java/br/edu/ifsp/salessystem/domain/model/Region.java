package br.edu.ifsp.salessystem.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "region_name")
    private String name;

//    @OneToMany
//    @OrderColumn
//    private Zone[] zones;

//    @OneToOne
//    private Vendor regionRepresentative;

//    @OneToMany(mappedBy = "region")
//    private List<State> states = new ArrayList<>();

}
