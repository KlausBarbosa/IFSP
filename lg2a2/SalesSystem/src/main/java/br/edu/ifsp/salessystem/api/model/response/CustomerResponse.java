package br.edu.ifsp.salessystem.api.model.response;

import br.edu.ifsp.salessystem.domain.model.Zone;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CustomerResponse {

    public Long id;
    private String name;
    private String cpf;
    private LocalDate registrationDate;
    private Zone zone;



}
