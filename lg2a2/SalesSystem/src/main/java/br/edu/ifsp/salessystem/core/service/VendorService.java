package br.edu.ifsp.salessystem.core.service;

import br.edu.ifsp.salessystem.api.model.response.VendorResponse;
import br.edu.ifsp.salessystem.domain.exception.CustomerNotFoundException;
import br.edu.ifsp.salessystem.domain.model.Customer;
import br.edu.ifsp.salessystem.domain.model.Order;
import br.edu.ifsp.salessystem.domain.model.Vendor;
import br.edu.ifsp.salessystem.domain.repository.CustomerRepository;
import br.edu.ifsp.salessystem.domain.repository.OrderRepository;
import br.edu.ifsp.salessystem.domain.repository.VendorRepository;
import br.edu.ifsp.salessystem.domain.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
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

    public void calculateSalesComission(Long vendorId) {
        var vendor = findOrFail(vendorId);

        //Customers com conta criada dentro do mês na zone
        List<Customer> customers = customerRepository.findByZoneId(vendor.getVendorZone());
        List<Customer> newCustomers = customers.stream().filter(customer ->
                        customer.getRegistrationDate().getMonth() == LocalDate.now().getMonth())
                .collect(Collectors.toList());

        //Orders do mês associadas à Zone
        List<Order> ordersByZone = orderRepository.findByZoneId(vendor.getVendorZone()).stream().filter(order ->
                order.getOrderDate().getMonth() == LocalDate.now().getMonth()).collect(Collectors.toList());


        //TODO: Acrescentar outras Order-Zones em caso de Representante regional
        //TODO: Acrescentar calculo direto em cima das orders por categoria
    }
}
