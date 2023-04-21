package br.edu.ifsp.salessystem.api.assembler;

import br.edu.ifsp.salessystem.api.model.response.CustomerResponse;
import br.edu.ifsp.salessystem.domain.model.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerResponseAssembler {

    @Autowired private ModelMapper modelMapper;

    public CustomerResponse toResponse(Customer customerEntity) {
        return modelMapper.map(customerEntity, CustomerResponse.class);
    }
}
