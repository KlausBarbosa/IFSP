package br.edu.ifsp.salessystem.api.controller;

import br.edu.ifsp.salessystem.api.assembler.OrderResponseAssembler;
import br.edu.ifsp.salessystem.api.model.request.OrderRequest;
import br.edu.ifsp.salessystem.api.model.response.OrderResponse;
import br.edu.ifsp.salessystem.core.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderResponseAssembler orderResponseAssembler;

    @Autowired
    private ModelMapper modelMapper;

    //TODO: Criar endpoint para enviar um pedido novo e endpoint pra disparar consumo de pedido local batch (txt)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResponse addOrder(@RequestBody @Valid OrderRequest order) {
        try {
            return orderResponseAssembler.toResponse(orderService.saveOrder(order));
        } catch (Exception e) {
            throw e;
        }
    }

}
