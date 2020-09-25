package com.kgc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.mapper.BookMapper;
import com.kgc.pojo.Book;
import com.kgc.service.BookSelectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-09-25 12:09
 */
@Service("bookSelectService")
public class BookSelectServiceImpl implements BookSelectService {
    @Resource
    BookMapper bookMapper;
    @Override
    public PageInfo<Book> selectBooks(int pageIndex) {
        int pageSize = 3;
        PageHelper.startPage(pageIndex, pageSize);
        PageHelper.orderBy("id desc");
        List<Book> books = bookMapper.selectByExample(null);
        PageInfo<Book> pageInfo = new PageInfo<>(books);
        return pageInfo;
    }
}
