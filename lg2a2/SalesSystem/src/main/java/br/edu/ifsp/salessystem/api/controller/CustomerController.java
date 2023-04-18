package br.edu.ifsp.salessystem.api.controller;

import br.edu.ifsp.salessystem.api.request.CustomerRequest;
import br.edu.ifsp.salessystem.core.service.CustomerService;
import br.edu.ifsp.salessystem.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/clientes")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerService addRegister(@RequestBody @Valid CustomerRequest customerRequest) {
        try {
            return null;
        } catch (Exception e) {
            throw e;
        }
    }


}
