package com.hibernate.envers.example.vo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

@Audited
@Entity
public class Product {

	@Id
	private Long id;
	private String name;
	private String description;
	@NotAudited
	private int price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

}
