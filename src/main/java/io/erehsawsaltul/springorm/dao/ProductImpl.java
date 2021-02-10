package io.erehsawsaltul.springorm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import io.erehsawsaltul.springorm.entity.Product;

@Component(value="productDao")
public class ProductImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		return (int) hibernateTemplate.save(product);
	}

	@Override
	@Transactional
	public void update(Product product) {
		hibernateTemplate.update(product);
	}

	@Override
	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
	}

	@Override
	@Transactional
	public Product find(int id) {
		return hibernateTemplate.get(Product.class, id);

	}

	@Override
	@Transactional
	public void deleteAll(List<Product> products) {
		hibernateTemplate.deleteAll(products);
	}

	@Override
	public List<Product> findAll() {
		return hibernateTemplate.loadAll(Product.class);
	}
}
