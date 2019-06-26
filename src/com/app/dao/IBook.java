package com.app.dao;

import java.util.List;

import com.app.pojos.Book;

public interface IBook {

	List<Book> listBooks();

	String deleteBookList(Book book);

	Book getBookdetails(int bid);


}
