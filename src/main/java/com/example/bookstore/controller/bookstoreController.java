package com.example.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.bookstore.book.BookRepository;

@Controller
public class bookstoreController {
	@Autowired
	private BookRepository repository;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getBooks(Model model) {
		return "index";
	}
}
