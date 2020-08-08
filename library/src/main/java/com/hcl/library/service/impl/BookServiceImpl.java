package com.hcl.library.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.library.exception.BadResourceRequestException;
import com.hcl.library.exception.BookNotFoundException;
import com.hcl.library.exception.NoDataFoundException;
import com.hcl.library.model.Book;
import com.hcl.library.repository.BookRepository;
import com.hcl.library.service.BookService;


@Service
public class BookServiceImpl implements BookService {

	
	 @Autowired
	 private BookRepository bookRepository;   
	 
	 
	@Override
	public void createNewBook(Book book) {
		
		
		Optional<Book> existingModel = bookRepository.findById(book.getBid());

		if (existingModel.isPresent()) {
			throw new BadResourceRequestException("Book with same id exists.");
		}
		bookRepository.save(book);
		
	}

	@Override
	public List<Book> searchBook(String title, String author, String category) {
		List<Book> books = bookRepository.getBookStockByTitleOrAuthorOrCategory(title, author,category);
		if (books.isEmpty()) {
            throw new BookNotFoundException(title);
        }
		return books;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = bookRepository.findAll();
		if (books.isEmpty()) {
            throw new NoDataFoundException();
        }
		return books;
	}

}
