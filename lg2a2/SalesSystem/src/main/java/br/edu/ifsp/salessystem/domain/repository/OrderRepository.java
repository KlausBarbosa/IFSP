package br.edu.ifsp.salessystem.domain.repository;

import br.edu.ifsp.salessystem.domain.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {

    @Query("from customer_order where zone_id = :zone")
    List<CustomerOrder> findByZoneId(@Param("zone") Long zoneId);

}
