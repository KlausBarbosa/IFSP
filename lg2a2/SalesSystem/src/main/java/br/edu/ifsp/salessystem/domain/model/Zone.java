package br.edu.ifsp.salessystem.domain.model;

import ch.qos.logback.core.net.server.Client;

import javax.persistence.*;

public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private Region region;

    @OneToOne
    private Vendor vendor;

    @OneToMany
    private Customer[] customers;
}
