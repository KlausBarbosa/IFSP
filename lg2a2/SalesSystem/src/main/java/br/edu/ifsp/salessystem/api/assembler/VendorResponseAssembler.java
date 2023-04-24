package br.edu.ifsp.salessystem.api.assembler;

import br.edu.ifsp.salessystem.api.model.response.VendorResponse;
import br.edu.ifsp.salessystem.api.model.response.ZoneVendorResponse;
import br.edu.ifsp.salessystem.domain.model.Vendor;
import br.edu.ifsp.salessystem.domain.model.Zone;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VendorResponseAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public VendorResponse toResponse(Vendor vendorEntity, Zone zone) {
        var vendorResponse = modelMapper.map(vendorEntity, VendorResponse.class);
        var zoneResponse = ZoneVendorResponse.builder()
                .id(zone.getId())
                .name(zone.getName()).build();
        vendorResponse.setZoneVendor(zoneResponse);

        return vendorResponse;
    }
}
