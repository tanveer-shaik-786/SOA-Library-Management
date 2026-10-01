package com.klu.LibraryMS;

import jakarta.persistence.*;

@Entity
public class Book {
	@Id
	int bid;
	String bname;
	String author;
	String isbn;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", isbn=" + isbn + "]";
	}
	
	public Book(int bid, String bname, String author, String isbn) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.isbn = isbn;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
