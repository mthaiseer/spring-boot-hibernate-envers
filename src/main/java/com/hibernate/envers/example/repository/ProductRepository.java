package com.hibernate.envers.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.hibernate.envers.example.vo.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
