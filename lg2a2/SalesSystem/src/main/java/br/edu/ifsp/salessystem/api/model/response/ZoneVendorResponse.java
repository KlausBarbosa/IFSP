package br.edu.ifsp.salessystem.api.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ZoneVendorResponse {

    private Long id;
    private String name;
}
