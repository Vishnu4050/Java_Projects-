package com.product.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Procuct;
import com.product.repository.Repository;

@Service
public class ProductService {
	@Autowired
	private Repository repository;
	
	public Procuct save(Procuct p) {
		return repository.save(p);
	}
	
	public List<Procuct> getall(){
		return repository.findAll();
	}
	
	public Optional<Procuct> getById(long id){
		return repository.findById(id);
	}
	
	public Procuct update(Procuct p) {
		return repository.save(p);
	}
	
	public void delete(long id)  {
		if(!repository.existsById(id)) {
			throw new IllegalArgumentException();		}
		repository.deleteById(id);
	}
	
	public Procuct update(long id,Procuct updateProduct) {
		return repository.findById(id).map(p->{
			p.setId(updateProduct.getId());
			p.setPname(updateProduct.getPname());
			p.setPrice(updateProduct.getPrice());
			p.setUdate(updateProduct.getUdate());
			return repository.save(p);
		}).orElseThrow();
	}

}
