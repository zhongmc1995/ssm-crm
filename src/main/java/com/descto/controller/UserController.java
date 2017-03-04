package com.descto.controller;

import com.descto.entity.User;
import com.descto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * 用户Controller层
 * Created by descto on 17-3-4.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(User user, HttpServletRequest request) throws Exception {
        User userResult = userService.login(user);
        if (userResult == null) {
            request.setAttribute("user", user);
            return "login";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", userResult);
            return "redirect:/home.jsp";
        }
    }
}
