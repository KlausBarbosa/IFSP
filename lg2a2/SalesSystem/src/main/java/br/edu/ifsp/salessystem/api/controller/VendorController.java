package br.edu.ifsp.salessystem.api.controller;

import br.edu.ifsp.salessystem.api.model.response.VendorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/vendors")
public class VendorController {



    @GetMapping("/{vendorId")
    public VendorResponse findVendor(@PathVariable Long vendorId) {
        var vendor =

        return null;
    }

}
