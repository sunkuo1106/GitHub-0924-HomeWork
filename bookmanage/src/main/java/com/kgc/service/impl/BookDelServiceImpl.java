package com.kgc.service.impl;

import com.kgc.mapper.BookMapper;
import com.kgc.service.BookDelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookDelServiceImpl implements BookDelService {
    @Resource
    BookMapper bookMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return bookMapper.deleteByPrimaryKey(id);
    }
}
