package br.edu.ifsp.salessystem.api.assembler;

import br.edu.ifsp.salessystem.api.model.response.CustomerResponse;
import br.edu.ifsp.salessystem.api.model.response.OrderResponse;
import br.edu.ifsp.salessystem.domain.model.Order;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderResponseAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public OrderResponse toResponse(Order orderEntity) {
        return modelMapper.map(orderEntity, OrderResponse.class);
    }
}
