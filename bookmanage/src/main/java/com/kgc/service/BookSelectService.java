package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Book;

/**
 * @author wangyf
 * @create 2020-09-25 12:09
 */
public interface BookSelectService {
    //查询
    PageInfo<Book> selectBooks(int pageIndex);
}
