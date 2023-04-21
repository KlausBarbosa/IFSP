package br.edu.ifsp.salessystem.domain.model;

import lombok.Data;
import org.springframework.core.annotation.Order;

import javax.persistence.*;

@Entity
@Data
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "zone_name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    @OneToOne
    @JoinColumn(name = "vendor_id", nullable = false)
    private Vendor vendor;

//    @OneToMany(mappedBy = "customer")
//    private Customer customer;
}
