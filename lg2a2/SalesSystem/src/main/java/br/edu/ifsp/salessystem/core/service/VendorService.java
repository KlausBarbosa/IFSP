package br.edu.ifsp.salessystem.core.service;

import br.edu.ifsp.salessystem.core.util.HelperUtil;
import br.edu.ifsp.salessystem.domain.exception.CustomerNotFoundException;
import br.edu.ifsp.salessystem.domain.model.Customer;
import br.edu.ifsp.salessystem.domain.model.CustomerOrder;
import br.edu.ifsp.salessystem.domain.model.Vendor;
import br.edu.ifsp.salessystem.domain.model.Zone;
import br.edu.ifsp.salessystem.domain.repository.CustomerRepository;
import br.edu.ifsp.salessystem.domain.repository.OrderRepository;
import br.edu.ifsp.salessystem.domain.repository.VendorRepository;
import br.edu.ifsp.salessystem.domain.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorRepository;

    @Autowired
    private ZoneRepository zoneRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private HelperUtil helperUtil;

//    public Vendor saveVendor(VendorRequest vendorRequest) {
////        Long vendorId = helperUtil.findZoneCode(customerRequest.getUf());
//
//        Customer customer = Customer.builder()
//                .name(customerRequest.getName())
//                .cpf(customerRequest.getCpf())
//                .zone(zone).build();
//
//        return customerRepository.save(customer);
//    }

    public Vendor findOrFail(Long vendorId) {
        return vendorRepository.findById(vendorId)
                .orElseThrow(() -> new CustomerNotFoundException(vendorId));
    }

    public double calculateSalesComission(Vendor vendor) {

        //Customers com conta criada dentro do mês na zone TODO: Adicionar valor fixo por cada NEWcustomer no mês
        List<Customer> customers = customerRepository.findByZoneId(vendor.getVendorZone());
        List<Customer> newCustomers = customers.stream().filter(customer ->
                        customer.getRegistrationDate().getMonth() == LocalDate.now().getMonth())
                .collect(Collectors.toList());

        List<CustomerOrder> ordersByZone;

        if (vendor.isRegionAgent()) {
            ordersByZone = new ArrayList<>();
            //Acrescentar outras Order-Zones em caso de Representante regional
            Optional<Zone> agentZone = zoneRepository.findById(vendor.getVendorZone());
            List<Zone> zones = zoneRepository.findZonesByRegionId(agentZone.get().getRegion());


            //Para cada Zone pertencente à região, adicionar a lista de itens vendidos dentro do mês
            zones.stream().forEach(zone -> orderRepository.findByZoneId(zone.getId()).stream().filter(orders ->
                    orders.getOrderDate().getMonth() == LocalDate.now().getMonth()).forEach(ordersByZone::add));

        } else {
            //Orders do mês associadas à Zone
            ordersByZone = orderRepository.findByZoneId(vendor.getVendorZone()).stream().filter(order ->
                    order.getOrderDate().getMonth() == LocalDate.now().getMonth()).collect(Collectors.toList());
        }
        //calcula o valor de comissão com base nas ordens de venda passadas
        var comissions = calculateTotalComission(ordersByZone);
        if (!newCustomers.isEmpty()) {
            comissions += newCustomers.size() * 10;
        }

        return comissions;
    }

    private double calculateTotalComission(List<CustomerOrder> orders) {
        double vendorComission =
                orders.stream().mapToDouble(order -> helperUtil.findComissionPercent(order.getProductId()) * order.getPrice()).sum();
        return vendorComission;
    }
}
