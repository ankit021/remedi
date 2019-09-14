package com.liberary.dao;

import java.util.List;

import com.liberary.model.Book;

public interface BooksDao {
	
	public List<Book> findBooks(String bId);

}
