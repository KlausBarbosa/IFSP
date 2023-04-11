package br.edu.ifsp.salessystem.domain.model;

import br.edu.ifsp.salessystem.domain.model.util.Leitor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Data
public class Customer {

    private Long id;
    private String cpf;
    private String name;
    private State state;

    @CreationTimestamp
    private LocalDate registrationDate;

    @ManyToOne
    @JoinColumn(name = "zone_id")
    private Zone zone;

    private List<Order> orders;


    public Customer(String caminho, int chave, String valorChave) throws Exception {
        Leitor leitor = new Leitor(caminho, chave, valorChave);
        ArrayList<String> clientes = leitor.conteudo();
        String cliente = clientes.get(0);
        System.out.println(cliente);
        String[] campos = cliente.split(";");
        this.cpf = campos[0];
        this.name = campos[1];

        String caminhoPedido = "./src/Pedido.txt";
        int chavePedido = 1;
        String valorChavePedido = this.cpf;
        leitor = new Leitor(caminhoPedido, chavePedido, valorChavePedido);
        ArrayList<String> pedidos = leitor.conteudo();
        int qtPedidos = pedidos.size();
        this.orders = List.of(new Order[qtPedidos]);
        int indicePedido = 0;
        for (String pedidoAux : pedidos) {
            campos = pedidoAux.split(";");
            int idPedido = Integer.parseInt(campos[0]);
            String cpf = campos[1];
            String[] campoData = campos[2].split("/");
            int dia = Integer.parseInt(campoData[0]);
            int mes = Integer.parseInt(campoData[1]);
            int ano = Integer.parseInt(campoData[2]);
            LocalDate dataPedido = LocalDate.of(ano,mes,dia);
            double valor = Double.parseDouble(campos[3]);
            Order pedido = new Order(idPedido,cpf,dataPedido,valor);
            this.orders.set(indicePedido, pedido);
            indicePedido =+ 1;
        }
    }
}