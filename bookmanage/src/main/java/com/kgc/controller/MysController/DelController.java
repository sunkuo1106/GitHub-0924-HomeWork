package com.kgc.controller.MysController;

import com.kgc.service.BookDelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class DelController {
    @Resource
    BookDelService bookDelService;
    /*location.href="/delBook?id="+id;*/
    @RequestMapping("/delBook")
    public String delBook(Integer id, HttpSession session){
        int i = bookDelService.deleteByPrimaryKey(id);
       /* if(i>0){
            session.setAttribute("dele","删除成功");
        return "redirect:/GetAllServlet";
    }else{
            session.setAttribute("dele","删除失败");
            return "redirect:/GetAllServlet";
        }*/
        session.setAttribute("dele","删除成功");
        return "redirect:/GetAllServlet";
    }

}
