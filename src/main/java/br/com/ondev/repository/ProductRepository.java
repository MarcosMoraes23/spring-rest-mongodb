package br.com.ondev.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ondev.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	public List<Product> findByDescription(String description);
}
