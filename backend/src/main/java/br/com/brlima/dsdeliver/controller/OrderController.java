package br.com.brlima.dsdeliver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brlima.dsdeliver.service.OrderService;
import br.com.brlima.dsdeliver.service.dto.OrderDTO;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<OrderDTO>> findAll() {
		var result = service.findAll();
		return ResponseEntity.ok(result);
	}
}