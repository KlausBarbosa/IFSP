package br.edu.ifsp.salessystem.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;

    @Column(name = "customer_name")
    private String name;

    @CreationTimestamp
    private LocalDateTime registrationDate;

    @ManyToOne
    @NotNull
    @Valid
    @JoinColumn(name = "zone_id")
    private Zone zone;

}
