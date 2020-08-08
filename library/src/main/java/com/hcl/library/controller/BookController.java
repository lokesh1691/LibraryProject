
package com.hcl.library.controller;

import java.util.List;

import javax.validation.Valid;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.library.model.Book;
import com.hcl.library.service.BookService;

/**
 * The Book Controller for managing the books in LMS.
 */

@RestController
@RequestMapping(value = "/library")
public class BookController {
  
    @Autowired
    BookService bookService;

   

    /**
     * direct to the add book page
     *
     * @return
     */
    @ApiOperation(value = "adding book")
    @RequestMapping(value = "/book", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewBook(@RequestBody @Valid Book book) {
    	bookService.createNewBook(book);
    }

    @ApiOperation(value = "Filtering books")
    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public List<Book> searchBook(@RequestParam(required = false) String title, @RequestParam(required = false) String author,@RequestParam(required = false) String category) {
    	List<Book> book = bookService.searchBook(title,author,category);
		return book;       
        }
    @ApiOperation(value = "Get all books")
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBook() {
        return bookService.getAllBooks();
    }
    
}

