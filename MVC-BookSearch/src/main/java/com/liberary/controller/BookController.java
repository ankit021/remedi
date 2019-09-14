package com.liberary.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.liberary.model.Book;
import com.liberary.service.BookServiceImpl;

@Controller
public class BookController {

	public BookController() {

		System.out.println("bookController::constructor");

	}

	@Autowired(required = true)
	public BookServiceImpl bsi;

	@RequestMapping(value = "/bookdetails.ds")
	public String loadBook() {

		System.out.println("loadBook method called...!!");

		return "bookSearch";
	}

	@RequestMapping(value = "/displaybook.ds", method = RequestMethod.POST)
	public String viewBook(HttpServletRequest req, ModelMap model ) {
			
		String id = req.getParameter("bid");
		if(id!=null && !id.equals("")) {
			/*List<Book> book=bsi.retriveBook(id);
			System.out.println("BookSize"+book.size());*/
		}
		model.addAttribute("books", bsi.retriveBook(id));

		/*List<Book> book=bsi.retriveBook(id);

		model.addAttribute("books", book);
		System.out.println(id);
		*/
		return "bookSearch";

	}

}
