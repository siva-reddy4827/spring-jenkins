package com.example.demo.model;

public class BookDetails {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
public BookDetails() {
	// TODO Auto-generated constructor stub
}
	public BookDetails(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "BookDetails [id=" + id + "]";
	}
	
	
}
