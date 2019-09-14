package com.liberary.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.liberary.model.Book;
import com.liberary.util.ConnectionManager;

@Repository
public class BooksDaoImpl implements BooksDao {
	
	 StringBuffer bookSql=new StringBuffer("select * from bookh");
	
	private PreparedStatement ps;
	private Connection con=null;
	private ResultSet rs=null;
	
	List<Book> book= new ArrayList<Book>();
	public List<Book> findBooks(String bId) {
		con=ConnectionManager.getCon();
		try {
			if(bId!=null && !bId.equals("")) {
				bookSql.append(" where bId= '"+bId+"'");
			}
	
			ps=con.prepareStatement(bookSql.toString());
			rs=ps.executeQuery();
		
			while(rs.next()) {
			
			Book b= new Book();
		b.setBId(rs.getString("bId"));
		b.setBName(rs.getString("bName"));
		b.setBAuthor(rs.getString("bAuthor"));
		b.setBPrice(rs.getDouble("bPrice"));
		b.setBQty(rs.getInt("bQty"));
		
		book.add(b);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return book;
	}

}
