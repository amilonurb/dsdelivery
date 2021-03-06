package br.com.brlima.dsdelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.brlima.dsdelivery.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT DISTINCT o from Order o JOIN FETCH o.products WHERE o.status = 0 ORDER BY o.moment ASC")
    List<Order> findOrdersWithProducts();
}