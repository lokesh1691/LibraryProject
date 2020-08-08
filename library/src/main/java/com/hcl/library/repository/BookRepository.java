package com.hcl.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.library.model.Book;


@Repository("bookRepository")
public interface BookRepository extends  JpaRepository<Book, Long>{
	
	List<Book> getBookStockByTitleOrAuthorOrCategory(String title, String author, String category);

}
