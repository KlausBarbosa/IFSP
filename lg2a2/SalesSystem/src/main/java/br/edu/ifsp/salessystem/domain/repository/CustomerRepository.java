package br.edu.ifsp.salessystem.domain.repository;

import br.edu.ifsp.salessystem.core.service.CustomerService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerService, Long> {


}
