package br.edu.ifsp.salessystem.core.service;

import br.edu.ifsp.salessystem.api.model.request.OrderRequest;
import br.edu.ifsp.salessystem.domain.exception.CustomerNotFoundException;
import br.edu.ifsp.salessystem.domain.model.Order;
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


    public Order saveOrder(OrderRequest orderRequest) {
        Order order = Order.builder()
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

