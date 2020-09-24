package com.kgc.controller.WxyController;

import com.kgc.pojo.User;
import com.kgc.service.UserLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author shkstart
 * @create 2020-09-24 21:22
 */
@Controller
public class LoginController {
    @Resource
    UserLoginService userLoginService;
    @RequestMapping("/login")
    public String doLogin(String name, String password, HttpSession session, Model model){
        Map<String,Object> map=new HashMap<>();
        User users = userLoginService.users(name);
        if(users==null||users.getPassword().equals(password)==false){
            model.addAttribute("flag",false);
            return "index";
        }else{
            model.addAttribute("flag",true);
            session.setAttribute("users",users);
        }
        return "main";
    }
}
