package br.edu.ifsp.salessystem.api.assembler;

import br.edu.ifsp.salessystem.api.model.request.CustomerRequest;
import br.edu.ifsp.salessystem.domain.model.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRequestDisassembler {

    @Autowired
    private ModelMapper modelMapper;

    public Customer toDomainObject(CustomerRequest customerRequest) {
        return modelMapper.map(customerRequest, Customer.class); //TODO: add mapeamento personalizado
    }
}
