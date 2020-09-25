package com.kgc.controller.SkController;

import com.kgc.pojo.Book;
import com.kgc.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-09-25 12:51
 */
@Controller
public class wjtController {
    @Resource
    BookService bookService;

    @RequestMapping("/addBook")
    public String addBook(Book book, Model model){
        bookService.add(book);
        model.addAttribute("msg","添加成功");
        return "index";
    }

}
