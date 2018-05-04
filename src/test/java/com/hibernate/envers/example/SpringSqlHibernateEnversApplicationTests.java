package com.hibernate.envers.example;

import java.util.Optional;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.hibernate.envers.example.repository.ProductRepository;
import com.hibernate.envers.example.vo.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringSqlHibernateEnversApplicationTests {

	@Autowired
	private ApplicationContext context;
	ProductRepository repository;

	@Before
	public void init() {
		 repository = context.getBean(ProductRepository.class);
	}

	@Test
	public void test_create_product_sucessful() {

		Product product = new Product();
		product.setId(1003L);
		product.setName("Cake");
		product.setDescription("good product");
		product.setPrice(23);

		repository.save(product);

	}

	@Test
	public void test_edit_product_audit_successful() {

		Optional<Product> productOptional = repository.findById(1003L);
		Product product = productOptional.get();
		System.out.println("[[[[["+ product+"]]]]]");
		product.setDescription("description changed");
		repository.save(product);

	}

}
