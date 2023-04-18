package br.edu.ifsp.salessystem.api.request;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Component
public class CustomerRequest {

    @NotBlank
    private String cpf;

    @NotBlank
    private String name;

    @NotNull
    private StateRequest state;

}
