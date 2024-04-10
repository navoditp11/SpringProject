package com.library.LibrarySpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.LibrarySpringBootApplication.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
