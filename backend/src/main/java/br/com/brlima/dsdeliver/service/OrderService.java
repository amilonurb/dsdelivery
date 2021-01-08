package br.com.brlima.dsdeliver.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.brlima.dsdeliver.repository.OrderRepository;
import br.com.brlima.dsdeliver.service.dto.OrderDTO;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		var result = repository.findOrdersWithProducts();
		return result.stream().map(OrderDTO::new).collect(Collectors.toList());
	}
}