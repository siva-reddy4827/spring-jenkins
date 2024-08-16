package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.BookNotFoundException;
import com.example.demo.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Book getBookById(int id) {
		if(id == 100) {
			return new Book(100, "java");
		}else {
			throw new BookNotFoundException("No book found");
		}
		
		
	}

}
