package br.edu.ifsp.salessystem.api.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendorComissionResponse {

    public Long id;
    public String name;
    public boolean regionAgent;
    public double totalMonthlyComission;
}
