package br.edu.ifsp.salessystem.api.assembler;

import br.edu.ifsp.salessystem.api.request.CustomerRequest;
import br.edu.ifsp.salessystem.core.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRequestDisassembler {

    @Autowired
    private ModelMapper modelMapper;

    public CustomerService toDomainObject(CustomerRequest customerRequest) {
        return modelMapper.map(customerRequest, CustomerService.class);
    }
}
