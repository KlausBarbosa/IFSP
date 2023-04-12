package br.edu.ifsp.salessystem.domain.model;

import br.edu.ifsp.salessystem.domain.model.util.Leitor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {
    private Long id;

    @Column(name = "customer_cpf")
    private String cpf;
    private LocalDate orderDate;
    private double price;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public Order(int idPedido, String cpf, LocalDate dataPedido, double price) {
        this.id = (long) idPedido;
        this.cpf = cpf;
        this.orderDate = dataPedido;
        this.price = price;
    }

    public Order(String caminho, int chave, String valorChave) throws Exception {
        Leitor leitor = new Leitor(caminho, chave, valorChave);
        ArrayList<String> pedidos = leitor.conteudo();
        String pedido = pedidos.get(0);
        String[] campos = pedido.split(";");
        this.id = Long.valueOf(campos[0]);
        this.cpf = campos[1];
        String[] campoData = campos[2].split("/");
        int dia = Integer.parseInt(campoData[0]);
        int mes = Integer.parseInt(campoData[1]);
        int ano = Integer.parseInt(campoData[2]);
        this.orderDate = LocalDate.of(ano,mes,dia);
        this.price = Double.parseDouble(campos[3]);
        this.product.setId(Long.parseLong(campos[4]));

//        TODO: Armazenar o Order no DB -- Criar classe de serviço para jogar o método inteiro
    }

}
