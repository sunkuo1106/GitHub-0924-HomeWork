package com.kgc.service;

import com.kgc.pojo.Book;

public interface BookUpdService {
    public Book selectById(int id);
    public void update(Book b);
}
