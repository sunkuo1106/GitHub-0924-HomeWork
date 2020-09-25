package com.kgc.controller.WyfController;

import com.github.pagehelper.PageInfo;
import com.kgc.pojo.Book;
import com.kgc.service.BookSelectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * @author wangyf
 * @create 2020-09-25 12:07
 */
@Controller
public class SelectController {
    @Resource
    BookSelectService bookSelectService;
    @RequestMapping("/GetAllServlet")
    public String selectBookByPageIndex(@RequestParam(value = "pageNum", defaultValue = "1",required = false) Integer pageNum, Model model){
        PageInfo<Book> pageInfo = bookSelectService.selectBooks(pageNum);
        model.addAttribute("PageInfo",pageInfo);
        return "main";
    }
}
