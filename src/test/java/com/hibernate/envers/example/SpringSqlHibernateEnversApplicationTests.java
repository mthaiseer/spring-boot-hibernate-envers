package com.hibernate.envers.example;

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

	@Test
	public void test_create_product_sucessful() {
		
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product product = new Product();
		product.setId(1002L);
		product.setName("IMusic");
		product.setDescription("avarage product");
		product.setPrice(1003);
		
		repository.save(product);
		
		
	}

}
