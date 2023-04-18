package br.edu.ifsp.salessystem.domain.model;

import br.edu.ifsp.salessystem.core.service.CustomerService;

import javax.persistence.*;

public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    @OneToOne
    @JoinColumn(name = "vendor_id", nullable = false)
    private Vendor vendor;

    @OneToMany(mappedBy = "customer")
    private CustomerService[] customers;
}
