package br.edu.ifsp.salessystem.domain.repository;

import br.edu.ifsp.salessystem.domain.model.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long> {

}
