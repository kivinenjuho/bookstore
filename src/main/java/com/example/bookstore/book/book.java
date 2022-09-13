package com.example.bookstore.book;

public class book {
	
	public String title;
	public String author;
	public int year;
	public String isbn;
	public int price;
	
	public book() {
		super();
		this.title = null;
		this.author = null;
		this.year = (Integer) null;
		this.isbn = null;
		this.price = (Integer) null;
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
