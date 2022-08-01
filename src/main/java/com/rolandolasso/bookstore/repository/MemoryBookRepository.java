package com.rolandolasso.bookstore.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

import com.rolandolasso.bookstore.model.Book;

import lombok.var;

@Repository
public class MemoryBookRepository implements BookRepository {
  private Map<String, Book> booksMap;

  public MemoryBookRepository() {
    booksMap = new HashMap<>();
  }

  @Override
  public List<Book> findByAuthor(String author) {
    return booksMap.values().stream()
        .filter(b -> b.getAuthor().toLowerCase().contains(author.toLowerCase()))
        .collect(Collectors.toList());
  }

  @Override
  public List<Book> findByTitle(String author) {
    return booksMap.values().stream()
        .filter(b -> b.getTitle().toLowerCase().contains(author.toLowerCase()))
        .collect(Collectors.toList());
  }

  @Override
  public Book delete(String id) {
    return booksMap.remove(id);
  }

  @Override
  public Book get(String id) {
    return booksMap.get(id);
  }

  @Override
  public List<Book> getAll() {
    var bookList = new ArrayList<>(booksMap.values());
    return bookList;
  }

  @Override
  public Book save(Book book) {
    if (book.getId() == null) {
      book.setId(UUID.randomUUID().toString());
    }
    booksMap.put(book.getId(), book);
    return book;
  }
}
