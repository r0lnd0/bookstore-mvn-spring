package com.rolandolasso.bookstore.repository;

import java.util.List;

import com.rolandolasso.bookstore.model.Book;

public interface BookRepository extends Repository<Book> {
  public List<Book> findByTitle(String title);
  public List<Book> findByAuthor(String author);
}
