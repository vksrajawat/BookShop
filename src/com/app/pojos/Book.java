package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book_details")
public class Book {

	private Integer id;
	private String name,author,price,category;
	private Integer quantity;
	
	public Book() {
	
	}

	
	public Book(String name, String author, String price, String category, Integer quantity) {
		super();
		
		this.name = name;
		this.author = author;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}


	
	public void setId(Integer id) {
		this.id = id;
	}


	@Column(length=20)
	public String getName() {
		return name;
	}


	
	public void setName(String name) {
		this.name = name;
	}


	@Column(length=20)
	public String getAuthor() {
		return author;
	}


	
	public void setAuthor(String author) {
		this.author = author;
	}


	@Column(length=10,unique=true)
	public String getPrice() {
		return price;
	}


	
	public void setPrice(String price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	
	public void setCategory(String category) {
		this.category = category;
	}


	
	public Integer getQuantity() {
		return quantity;
	}


	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", category="
				+ category + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	
	
}
