package cn.org.ltl.controller;

import cn.org.ltl.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;

@Controller("loginController")
@RequestMapping("/page")
class LoginServlet extends HttpServlet {

    @Resource
    LoginService loginService;
    @RequestMapping("/login")
    public String login(String username, String pwd, Model model){

        if(loginService.loginVilidation(username, pwd)){
            model.addAttribute("username", username);
            model.addAttribute("pwd", pwd);
            return "welcome1";
        } else {
            model.addAttribute("message", "Username or Password is Wrong! Please try again!");
            return "no";
        }
    }
}