package br.edu.ifsp.salessystem.api.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendorResponse {

    public Long id;
    public Long zoneId;
    public String vendorName;
    public boolean isRegionAgent;

}
