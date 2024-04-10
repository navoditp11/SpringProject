package com.library.LibrarySpringBootApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.LibrarySpringBootApplication.entity.Book;
import com.library.LibrarySpringBootApplication.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookrepo;

	public Book addBook(Book b1) {
		return bookrepo.save(b1);
		
	}

}
