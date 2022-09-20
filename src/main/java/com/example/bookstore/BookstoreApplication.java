package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.book.BookRepository;
import com.example.bookstore.book.book;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		return (args) -> {
			book b = new book("Esimerkki", "Juho Kivinen", "8343927", 2022, 49);
			book b2 = new book("Esimerkki2", "Juho Kivinen", "8343553", 2010, 10);
			
			repository.save(b);
			repository.save(b2);
			
		};
	}

}
