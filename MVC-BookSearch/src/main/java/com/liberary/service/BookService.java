package com.liberary.service;

import java.util.List;

import com.liberary.model.Book;

public interface BookService {

	public List<Book> retriveBook(String bId);
}
