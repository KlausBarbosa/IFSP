package br.edu.ifsp.salessystem.domain.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Vendor {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "vendor_name")
    private String name;

    @OneToOne
    @JoinColumn(name = "zone_id", nullable = false)
    private Zone vendorZone;

    private boolean isRegionAgent;

    private Region regionAgent;

    private void calculateSalesCommission() {
        //TODO: Adicionar calculo de comissão seguindo regras impostas (fazer implementação via interface)
    }
}
