package br.edu.ifsp.salessystem.domain.model;

import javax.persistence.*;

public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Region region;

    @OneToOne
    private Vendor vendor;

    @OneToMany(mappedBy = "customer")
    private Customer[] customers;
}
