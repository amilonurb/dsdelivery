package br.com.brlima.dsdelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.brlima.dsdelivery.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT DISTINCT order from Order order JOIN FETCH order.products WHERE order.status = 0 ORDER BY order.moment ASC")
    List<Order> findOrdersWithProducts();
}