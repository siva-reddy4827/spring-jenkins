package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.model.BookDetails;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping(value= "/getbook", produces = {"application/json"})
	public Book getBookDetails(@RequestParam("bid") String bid){
		return bookService.getBookById(Integer.parseInt(bid));
	}
	
	@PostMapping(value="/postbook",consumes  = {"application/json"}, produces = {"application/json"})
	public Book getBookDetails(@RequestBody BookDetails deatails) {
		return bookService.getBookById(deatails.getId());
	}
	
}
