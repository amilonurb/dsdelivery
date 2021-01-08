package br.com.brlima.dsdelivery.service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brlima.dsdelivery.entity.Order;
import br.com.brlima.dsdelivery.entity.enums.OrderStatus;
import br.com.brlima.dsdelivery.repository.OrderRepository;
import br.com.brlima.dsdelivery.repository.ProductRepository;
import br.com.brlima.dsdelivery.service.dto.OrderDTO;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        var result = repository.findOrdersWithProducts();
        return result.stream().map(OrderDTO::new).collect(Collectors.toList());
    }

    @Transactional
    public OrderDTO insert(OrderDTO dto) {
        final var order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), Instant.now(), OrderStatus.PENDING, null);

        dto.getProducts().forEach(p -> {
            var product = productRepository.getOne(p.getId());
            order.getProducts().add(product);
        });

        var newOrder = repository.save(order);
        return new OrderDTO(newOrder);
    }

    @Transactional
    public OrderDTO setDelivered(Long orderId) {
        var order = repository.getOne(orderId);
        order.setStatus(OrderStatus.DELIVERED);
        order = repository.save(order);
        return new OrderDTO(order);
    }
}