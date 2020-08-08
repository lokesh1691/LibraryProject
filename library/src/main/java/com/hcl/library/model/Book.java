package com.hcl.library.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Book implements Serializable {

	private static final long serialVersionUID = -3935141325230691557L;

	@Id
	private Long bid;
	
	private String title;
	
	private String author[];
	
	private int rackNumber; 
	
	private String category[];
	
	private int quantity;	


	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getAuthor() {
		return author;
	}

	public void setAuthor(String[] author) {
		this.author = author;
	}

	public int getRackNumber() {
		return rackNumber;
	}

	public void setRackNumber(int rackNumber) {
		this.rackNumber = rackNumber;
	}

	public String[] getCategory() {
		return category;
	}

	public void setCategory(String[] category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", author=" + Arrays.toString(author) + ", rackNumber="
				+ rackNumber + ", category=" + Arrays.toString(category) + ", quantity=" + quantity + "]";
	}
	
	
	
	
	
}
