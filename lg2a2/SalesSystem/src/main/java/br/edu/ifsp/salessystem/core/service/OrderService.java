package br.edu.ifsp.salessystem.core.service;

import br.edu.ifsp.salessystem.api.model.request.OrderRequest;
import br.edu.ifsp.salessystem.domain.exception.CustomerNotFoundException;
import br.edu.ifsp.salessystem.domain.model.CustomerOrder;
import br.edu.ifsp.salessystem.domain.repository.CustomerRepository;
import br.edu.ifsp.salessystem.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerOrder saveOrder(OrderRequest orderRequest) {
        CustomerOrder order = CustomerOrder.builder()
                .cpf(orderRequest.getCpf())
                .orderDate(orderRequest.getOrderDate())
                .price(orderRequest.getPrice())
                .productId(orderRequest.getProductId())
                .zoneId(findCustomerZone(orderRequest.getCpf()))
                .build();

        return orderRepository.save(order);
    }

    private Long findCustomerZone(String cpf) {
        try {
            var customerZone = customerRepository.findByCpf(cpf);
            return customerZone.getZone().getId();
        } catch (Exception e) {
            throw new CustomerNotFoundException(cpf); //todo:Criar exception para cpf
        }

    }

}

