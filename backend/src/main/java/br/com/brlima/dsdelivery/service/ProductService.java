package br.com.brlima.dsdelivery.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brlima.dsdelivery.repository.ProductRepository;
import br.com.brlima.dsdelivery.service.dto.ProductDTO;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        var result = repository.findAllByOrderByName();
        return result.stream().map(ProductDTO::new).collect(Collectors.toList());
    }
}