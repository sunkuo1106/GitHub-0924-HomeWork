package com.kgc.service.impl;

import com.kgc.mapper.BookMapper;
import com.kgc.pojo.Book;
import com.kgc.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-09-25 13:00
 */
@Service("bookService")
public class BookServiceImpl implements BookService{
    @Resource
    BookMapper bookMapper;

    @Override
    public void add(Book book) {
        bookMapper.insertSelective(book);
    }
}
