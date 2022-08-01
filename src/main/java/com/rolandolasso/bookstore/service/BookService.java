package com.rolandolasso.bookstore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rolandolasso.bookstore.model.Book;
import com.rolandolasso.bookstore.repository.BookRepository;

import lombok.var;

@Service
public class BookService {
  private final BookRepository bookRepository;

  
  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public Book delete(String id) {
    return bookRepository.delete(id); 
  }

  public List<Book> findByAuthor(String author) {
    return bookRepository.findByAuthor(author);
  }

  public List<Book> findByTitle(String title) {
    return bookRepository.findByTitle(title);
  }

  public Book get(String id) {
    return bookRepository.get(id);
  }

  public List<Book> getAll() {
    return bookRepository.getAll();
  }

  public Book addBook(Book book) {
    book.setId(null);
    return bookRepository.save(book);
  } 

  public Book updateBook(String id, Book book) {
    var bookRepo = bookRepository.get(id);
    if(bookRepo == null){
      return null;
    }
    book.setId(id);
    return bookRepository.save(book);
  } 
}
