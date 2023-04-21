package br.edu.ifsp.salessystem.api.controller;

import br.edu.ifsp.salessystem.api.assembler.CustomerResponseAssembler;
import br.edu.ifsp.salessystem.api.model.request.CustomerRequest;
import br.edu.ifsp.salessystem.api.model.response.CustomerResponse;
import br.edu.ifsp.salessystem.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/clientes")
public class CustomerController {

//    @Autowired
//    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerResponseAssembler customerResponseAssembler;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerResponse addRegister(@RequestBody @Valid CustomerRequest customerRequest) {
        try {
            return customerResponseAssembler.toResponse(customerService.saveCustomer(customerRequest));
        } catch (Exception e) {
            throw e;
        }
    }


}
