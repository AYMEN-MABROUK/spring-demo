package com.aymendragon.main.bootstrap;

import com.aymendragon.main.domain.Author;
import com.aymendragon.main.domain.Book;
import com.aymendragon.main.repositories.AuthorRepository;
import com.aymendragon.main.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

  private final AuthorRepository authorRepository;
  private final BookRepository bookRepository;

  public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
  }

  @Override
  public void run(String... args) throws Exception {

    Author eric = new Author("Eric","Evans");
    Book ddd = new Book("Domain Driven Design","123123");

    eric.getBooks().add(ddd);
    ddd.getAuthors().add(eric);

    authorRepository.save(eric);
    bookRepository.save(ddd);

    Author rod = new Author("Rod","Jonnson");
    Book noEJB = new Book("J2EE Development without EJB","1864148465");

    rod.getBooks().add(noEJB);
    noEJB.getAuthors().add(rod);

    authorRepository.save(rod);
    bookRepository.save(noEJB);

    System.out.println("Started in Bootstrap");
    System.out.println("Number of Books:"+ bookRepository.count());

  }
}
