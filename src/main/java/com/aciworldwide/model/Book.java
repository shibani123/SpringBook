package com.aciworldwide.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	private int bookid;
	private String booktitle;
	private String bookauthor;
	private String bookprice;
	private String bookquantity;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookid, String booktitle, String bookauthor, String bookprice, String bookquantity) {
		super();
		this.bookid = bookid;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
		this.bookquantity = bookquantity;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	@Column(name="bookauthor", nullable=false)
	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookprice() {
		return bookprice;
	}

	public void setBookprice(String bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookquantity() {
		return bookquantity;
	}

	public void setBookquantity(String bookquantity) {
		this.bookquantity = bookquantity;
	}
	
	
	
	
}
