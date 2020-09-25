package com.kgc.service.impl;

import com.kgc.mapper.BookMapper;
import com.kgc.pojo.Book;
import com.kgc.service.BookUpdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("bookUpdService")
public class BookUpdServiceImpl implements BookUpdService {
    @Resource
    BookMapper bookMapper;

    @Override
    public Book selectById(int id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Book b) {
        bookMapper.updateByPrimaryKey(b);
    }
}
