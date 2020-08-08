package com.hcl.library.service;

import java.util.List;

import com.hcl.library.model.Book;

public interface BookService {
	
	void createNewBook(Book book);
	
	List<Book> searchBook(String title, String author, String category);

	List<Book> getAllBooks();

}
