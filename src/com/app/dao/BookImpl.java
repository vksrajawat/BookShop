package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Book;

@Repository
public class BookImpl implements IBook {

	@Autowired
	private SessionFactory sf;
	
	public BookImpl() {
		System.out.println("In bookdao impl");
	}



	@Override
	public List<Book> listBooks() {
		String jpql = "select b from Book b";
		return sf.getCurrentSession().
				createQuery(jpql, Book.class).getResultList();
		
	}



	@Override
	public String deleteBookList(Book b) {
		sf.getCurrentSession().delete(b);
		return "Book details deleted for Book "+b.getId();
	}



	@Override
	public Book getBookdetails(int bid) {
		
		return sf.getCurrentSession().get(Book.class, bid);
	}



	


}
