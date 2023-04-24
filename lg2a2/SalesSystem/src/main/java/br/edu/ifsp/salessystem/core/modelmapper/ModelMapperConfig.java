package br.edu.ifsp.salessystem.core.modelmapper;

import br.edu.ifsp.salessystem.api.model.response.VendorResponse;
import br.edu.ifsp.salessystem.domain.model.Vendor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        var modelMapper = new ModelMapper();

        return modelMapper;
    }
}
