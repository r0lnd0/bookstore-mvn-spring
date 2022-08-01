package com.rolandolasso.bookstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rolandolasso.bookstore.model.Book;
import com.rolandolasso.bookstore.service.BookService;

@RestController
@RequestMapping({ "book" })
public class BookController {
  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("")
  public List<Book> getAll(@RequestParam(name = "author",required = false) String author, @RequestParam(name = "title",required = false) String title) {
    if (title != null) {
      return bookService.findByTitle(title);
    } else if (author != null){
      return bookService.findByAuthor(author);
    } else {
      return bookService.getAll();
    }
  }

  @GetMapping("/{id}")
  public Book get(@PathVariable String id) {
    return bookService.get(id);
  }

  @PostMapping("")
  public Book add(@RequestBody Book book) {
    return bookService.addBook(book);
  }

  @PutMapping("/{id}")
  public Book update(@PathVariable String id, @RequestBody Book book) {
    return bookService.updateBook(id, book);
  }

  @DeleteMapping("/{id}")
  public Book delete(@PathVariable String id) {
    return bookService.delete(id);
  }
  
}
