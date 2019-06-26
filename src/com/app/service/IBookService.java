package com.app.service;

import java.util.List;

import com.app.pojos.Book;

public interface IBookService {

	List<Book> listBooks();

	String deleteBookList(int bid);
	
    Book getBookDetails(int id);
    
	
}
