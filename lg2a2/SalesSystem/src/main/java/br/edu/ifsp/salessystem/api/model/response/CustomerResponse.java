package br.edu.ifsp.salessystem.api.model.response;

import br.edu.ifsp.salessystem.domain.model.Zone;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CustomerResponse {

    public Long id;
    private String name;
    private String cpf;
    private LocalDateTime registrationDate;
    private Zone zone;



}
