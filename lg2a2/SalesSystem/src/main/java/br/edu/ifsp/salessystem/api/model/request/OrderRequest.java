package br.edu.ifsp.salessystem.api.model.request;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Getter
@Setter
public class OrderRequest {

    private String cpf;
    private LocalDate orderDate;
    private double price;
    private Long productId;

}
