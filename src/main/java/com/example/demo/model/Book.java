package com.example.demo.model;

public class Book {

	public int getBookid() {
		return bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	private int bookid;
	private String bookName;
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + "]";
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, String bookName) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
	}
	
	
}
