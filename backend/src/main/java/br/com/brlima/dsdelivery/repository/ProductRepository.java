package br.com.brlima.dsdelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brlima.dsdelivery.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByOrderByName();
}