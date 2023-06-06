package br.edu.ifsp.salessystem.api.controller;

import br.edu.ifsp.salessystem.api.assembler.VendorResponseAssembler;
import br.edu.ifsp.salessystem.api.model.response.VendorComissionResponse;
import br.edu.ifsp.salessystem.api.model.response.VendorResponse;
import br.edu.ifsp.salessystem.core.service.VendorService;
import br.edu.ifsp.salessystem.core.service.ZoneRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendors")
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @Autowired
    private ZoneRegisterService zoneRegisterService;

    @Autowired
    private VendorResponseAssembler vendorResponseAssembler;


    @GetMapping("/{vendorId}")
    public VendorResponse findVendor(@PathVariable Long vendorId) {
        var vendor = vendorService.findOrFail(vendorId);
        var zone = zoneRegisterService.findOrFail(vendor.getVendorZone());

        return vendorResponseAssembler.toResponse(vendor, zone);
    }

    @GetMapping("/{vendorId}/calculate-comission")
    public VendorComissionResponse calculateSalesComission(@PathVariable Long vendorId) {

        try {
            var vendor = vendorService.findOrFail(vendorId);
            var comissionCalculated = vendorService.calculateSalesComission(vendor);
            var vendorResponse =  vendorResponseAssembler.toResponseWithComission(vendor, comissionCalculated);
            return vendorResponse;
        } catch (Exception e) {
            throw e;
        }
    }
}
