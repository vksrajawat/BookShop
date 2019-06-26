package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IBook;
import com.app.pojos.Book;

@Service
@Transactional
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBook dao;
	
	@Override
	public List<Book> listBooks() {
		System.out.println("in book dao service");
		return dao.listBooks();
	}

	@Override
	public String deleteBookList(int bid) {
		System.out.println("in book dao service");
		return dao.deleteBookList(dao.getBookdetails(bid));
		
		
	}

	@Override
	public Book getBookDetails(int id) {
		System.out.println("in book dao service");
		return dao.getBookdetails(id);
	}

	




}
