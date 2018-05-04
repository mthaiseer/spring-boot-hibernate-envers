package com.hibernate.envers.example;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hibernate.envers.example.repository.ProductRepository;
import com.hibernate.envers.example.vo.Product;

@SpringBootApplication
public class SpringSqlHibernateEnversApplication {

	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSqlHibernateEnversApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(ProductRepository repository) {
	    return (args) -> {
	    	
	    	//CREATE
	    	Product product = new Product();
			product.setId(1005L);
			product.setName("Cake");
			product.setDescription("good product");
			product.setPrice(23);

	    	repository.save(product);
	    	
	    	//UPDATE
	    	Optional<Product> productOptional = repository.findById(1005L);
			Product productToUpdate = productOptional.get();
			productToUpdate.setDescription("description changed");
			repository.save(productToUpdate);
	    };
	
	}  

}
