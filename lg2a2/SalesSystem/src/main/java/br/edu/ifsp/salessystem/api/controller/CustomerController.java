package br.edu.ifsp.salessystem.api.controller;

import br.edu.ifsp.salessystem.api.assembler.CustomerResponseAssembler;
import br.edu.ifsp.salessystem.api.model.request.CustomerRequest;
import br.edu.ifsp.salessystem.api.model.response.CustomerResponse;
import br.edu.ifsp.salessystem.core.service.CustomerService;
import br.edu.ifsp.salessystem.domain.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/customers")
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
        } catch (Exception ex) {
            throw ex;
        }
    }

    @GetMapping("/{customerId}")
    public  CustomerResponse findCustomer(@PathVariable Long customerId) {
        return customerResponseAssembler.toResponse(customerService.findOrFail(customerId));
    }


}
