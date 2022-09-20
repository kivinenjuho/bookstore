package com.example.bookstore.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	public String title;
	public String author;
	public String isbn;
	@Column(name="publishing_year") public Integer year;
	public Integer price;
	
	
	@JsonIgnore
	
	
	public book() {}
	
	public book(String title, String author, String isbn, int year, int price) {
		super();
		this.title = null;
		this.author = null;
		this.year = null;
		this.isbn = null;
		this.price = null;
	}
	
	public long getID() {
	return id;
}
	public void setID(long id) {
		this.id = id;
	}
	public void settitle(String title) {
		this.title = title;
	}
	
	public void setauthor(String author) {
		this.author = author;
	}
	
	public void setyear(int year) {
		this.year = year;
	}
	
	public void setisbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	
	public String gettitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public int getyear() {
		return year;
	}
	public String getisbn() {
		return isbn;
	}
	public int getprice() {
		return price;
	}
}
