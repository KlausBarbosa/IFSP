package br.edu.ifsp.salessystem.core.service;

import br.edu.ifsp.salessystem.domain.exception.ZoneNotFoundException;
import br.edu.ifsp.salessystem.domain.model.Zone;
import br.edu.ifsp.salessystem.domain.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneRegisterService {

    @Autowired
    private ZoneRepository zoneRepository;

    public Zone findOrFail(Long zoneId) {
        return zoneRepository.findById(zoneId)
                .orElseThrow(() -> new ZoneNotFoundException(zoneId));
    }
}
