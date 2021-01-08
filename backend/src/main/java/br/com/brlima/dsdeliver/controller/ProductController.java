package br.com.brlima.dsdeliver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brlima.dsdeliver.service.ProductService;
import br.com.brlima.dsdeliver.service.dto.ProductDTO;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAll() {
		var result = service.findAll();
		return ResponseEntity.ok(result);
	}
}