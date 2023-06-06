package br.edu.ifsp.salessystem.api.assembler;

import br.edu.ifsp.salessystem.api.model.response.OrderResponse;
import br.edu.ifsp.salessystem.domain.model.CustomerOrder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderResponseAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public OrderResponse toResponse(CustomerOrder orderEntity) {
        return modelMapper.map(orderEntity, OrderResponse.class);
    }
}
