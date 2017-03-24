package br.com.ondev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ondev.model.Product;
import br.com.ondev.repository.ProductRepository;

@Service
public class ProductService{

	@Autowired
	private ProductRepository repository;

	public Product save(Product entity) {
		return repository.save(entity);
	}

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findOne(String id) {
		return repository.findOne(id);
	}

	public void delete(Product entity) {
		repository.delete(entity);
	}	
	
}
