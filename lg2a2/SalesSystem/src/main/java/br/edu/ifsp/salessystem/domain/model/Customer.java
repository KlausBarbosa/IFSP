package br.edu.ifsp.salessystem.domain.model;

import br.edu.ifsp.salessystem.domain.model.util.Leitor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

@Entity
public class Customer {

    private Long id;
    private String cpf;
    private String nome;
    private Estado estado;

    @ManyToOne
    private Zone zone;

    private Order[] pedidos;


    public Customer(String caminho, int chave, String valorChave) throws Exception {
        Leitor leitor = new Leitor(caminho, chave, valorChave);
        ArrayList<String> clientes = leitor.conteudo();
        String cliente = clientes.get(0);
        System.out.println(cliente);
        String[] campos = cliente.split(";");
        this.cpf = campos[0];
        this.nome = campos[1];

        String caminhoPedido = "./src/Pedido.txt";
        int chavePedido = 1;
        String valorChavePedido = this.cpf;
        leitor = new Leitor(caminhoPedido, chavePedido, valorChavePedido);
        ArrayList<String> pedidos = leitor.conteudo();
        int qtPedidos = pedidos.size();
        this.pedidos = new Order[qtPedidos];
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
            this.pedidos[indicePedido] = pedido;
            indicePedido =+ 1;
        }
    }
    @Override
    public String toString() {
        return "Cliente [cpf=" + cpf + ", nome=" + nome + ", pedidos=" + Arrays.toString(pedidos) + "]";
    }
}
