package br.edu.ifsp.salessystem.domain.model;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@Builder
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;

    @Column(name = "customer_name")
    private String name;

    @CreationTimestamp
    private LocalDate registrationDate;

    @ManyToOne
    @NotNull
    @Valid
    @JoinColumn(name = "zone_id")
    private Zone zone;

}
