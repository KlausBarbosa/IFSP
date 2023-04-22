package br.edu.ifsp.salessystem.core.service;

import br.edu.ifsp.salessystem.domain.exception.CustomerNotFoundException;
import br.edu.ifsp.salessystem.domain.model.Vendor;
import br.edu.ifsp.salessystem.domain.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorService {

    @Autowired
    private VendorRepository vendorRepository;

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
}
