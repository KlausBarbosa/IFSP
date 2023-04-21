package br.edu.ifsp.salessystem.api.model.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Component
@Getter
@Setter
public class CustomerRequest {

    @NotBlank
    private String cpf;

    @NotBlank
    private String name;

//    @NotNull
//    private StateRequest state;

    @NotNull
    private String uf;

}
