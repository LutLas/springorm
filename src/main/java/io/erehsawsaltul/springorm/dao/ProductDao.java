package io.erehsawsaltul.springorm.dao;

import java.util.List;

import io.erehsawsaltul.springorm.entity.Product;

public interface ProductDao {
	int create(Product product);
	void update(Product product);
	void delete(Product product);
	void deleteAll(List<Product> products);
	Product find(int id);
	List<Product> findAll();
}
