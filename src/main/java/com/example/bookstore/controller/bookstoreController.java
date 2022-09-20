package com.example.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bookstore.book.BookRepository;
import com.example.bookstore.book.book;

@Controller
public class bookstoreController {
	
	@Autowired
	private BookRepository repository;
	
	@RequestMapping(value= {"/", "/booklist"})
	public String bookList(Model model) {
		model.addAttribute("book", repository.findAll());
		return "booklist";
	}
	
	@RequestMapping("/addbook")
	public String addbook(Model model) {
		model.addAttribute("book", new book());
		return "addbook";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deletebook(@PathVariable("id") Long id, Model model) {
		repository.deleteById(id);
		return "redirect:/booklist";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savebook(book book) {
		repository.save(book);
		return "redirect:booklist";
	}
}