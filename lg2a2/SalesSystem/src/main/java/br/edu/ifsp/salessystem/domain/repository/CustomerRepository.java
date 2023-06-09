package br.edu.ifsp.salessystem.domain.repository;

import br.edu.ifsp.salessystem.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("from Customer where cpf = :cpf")
    Customer findByCpf(@Param("cpf") String cpf);
//    @Query("from Restaurante r join fetch r.cozinha")

    @Query("from Customer where zone_id = :zone")
    List<Customer> findByZoneId(@Param("zone") Long zoneId);

}
