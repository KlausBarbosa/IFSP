package br.edu.ifsp.salessystem.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Vendor {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "vendor_name")
    private String name;

//    @JoinColumn(name = "zone_id", nullable = false)
    @JsonIgnore
    @Column(name = "zone_id")
    private Long vendorZone;

    @Column(name = "is_region_agent")
    private boolean regionAgent;

//    private Region regionAgent; TODO: Adicionar o region Agent Id

//    private void calculateSalesCommission() {
//        //TODO: Adicionar calculo de comissão seguindo regras impostas (fazer implementação via interface)
//    }
}
