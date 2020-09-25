package com.kgc.controller.LhxController;

import com.kgc.pojo.Book;
import com.kgc.service.BookUpdService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class UpdateController {
    @Resource
    BookUpdService bookUpdService;
    @RequestMapping("/updateBook")
    public String updcha(Model model,int id){
        Book b=bookUpdService.selectById(id);
        model.addAttribute("user",b);
        return "update";
    }
    @RequestMapping("/updBook")
    public String updBook(int id, String name, String author, String publish,String publishdate, int page, float price, String content, HttpSession session){
        Book b=new Book();
        b.setId(id);
        b.setName(name);
        b.setAuthor(author);
        b.setPublish(publish);
        b.setPublishdate(new Date());
        b.setPage(page);
        b.setPrice(price);
        b.setContent(content);
        bookUpdService.update(b);
        session.setAttribute("del","");
        return "redirect:/GetAllServlet";
    }
}
