package com.liberary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liberary.dao.BooksDaoImpl;
import com.liberary.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired(required=true)
	BooksDaoImpl bdao;
	
	public List<Book> retriveBook(String bId) {

		return bdao.findBooks(bId);
	}

}
