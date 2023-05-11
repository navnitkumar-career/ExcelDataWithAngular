package com.example.apigatway.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int id;
	private String name;
	private int price;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", city=" + city + "]";
	}
	public Product(int id, String name, int price, String city) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.city = city;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
