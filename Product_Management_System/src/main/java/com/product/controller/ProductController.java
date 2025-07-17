package com.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Procuct;
import com.product.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping
	public Procuct addProduct(@RequestBody Procuct p) {
		return service.save(p);
	}
	
	@GetMapping
	public List<Procuct> getAll(){
		return service.getall();
	}
	
	@GetMapping("/{id}")
	public Optional<Procuct> getByid(@PathVariable long id){
		return service.getById(id);	
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable long id) {
	service.delete(id);
	}
	
	@PutMapping("/{id}")
	public Procuct update(@PathVariable long id,@RequestBody Procuct updateProduct) {
	return service.update(id,updateProduct);
		
	
}
}