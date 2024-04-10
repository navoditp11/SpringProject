package com.library.LibrarySpringBootApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.library.LibrarySpringBootApplication.entity.Book;
import com.library.LibrarySpringBootApplication.service.BookService;

@RestController
public class LibraryController {
	
	@Autowired
	BookService bookservice;
	
	@Value("${spring.application.name}")
	public String appname;
	
	@Value("${info.developer.name}")
	public String developername;
	
	@GetMapping("/appname")
	public String getAppName() {
		return "Application Name" +appname;
		
	}
	
	@GetMapping("/developername")
	public String getDeveloperName() {
		return "Application Name" +developername;
		
	}

	@PostMapping("/addBookByRequestParam")
	public Book addBookByRequestParam(@RequestParam("titlefront") String titlejava, @RequestParam("authorfront") String authorjava, @RequestParam("categoryfront") String categoryjava) {
		Book b1 = new Book();
		b1.setAuthor(authorjava);
		b1.setTitle(titlejava);
		b1.setCategory(categoryjava);
		return bookservice.addBook(b1);	
	}
	
	@PostMapping("/addBookByRequestBody")
	public Book addBookByRequestBody(@RequestBody Book b2) {
		return bookservice.addBook(b2);		
	}
	
}
