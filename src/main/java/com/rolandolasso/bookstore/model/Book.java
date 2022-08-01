package com.rolandolasso.bookstore.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Book {
  private String id;
  private String title;
  private String description;
  private String author;
  private double price;
  private int qty;
  
  public Book(String id, String title, String description, String author, double price, int qty) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }
  
}
