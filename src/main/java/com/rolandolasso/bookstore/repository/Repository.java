package com.rolandolasso.bookstore.repository;

import java.util.List;

public interface Repository<T> {
  public List<T> getAll();
  public T get(String id);
  public T save(T t);
  public T delete(String id);
}
