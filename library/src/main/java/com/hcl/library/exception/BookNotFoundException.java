package com.hcl.library.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5061543130280586951L;

	public BookNotFoundException(String title) {

        super(String.format("Book with title '%s' not found", title));
    }

}
