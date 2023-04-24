package br.edu.ifsp.salessystem.domain.repository;

import br.edu.ifsp.salessystem.domain.model.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
