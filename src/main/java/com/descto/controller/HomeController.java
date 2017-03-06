package com.descto.controller;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by descto on 17-3-6.
 */
@Controller
public class HomeController {

/*    @Value("${user.salt}")
    private String passwordSalt;*/

    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * 登录
     * @param tel
     * @param password
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String login(String tel, String password, RedirectAttributes redirectAttributes) {

        //获取认证主体
        Subject subject = SecurityUtils.getSubject();
        if (subject.isAuthenticated()) {
            subject.logout();
        }
        try {
            //登录，调用ShiroRealm类中的登录认证方法
            subject.login(new UsernamePasswordToken(tel, DigestUtils.md5Hex(password)));
            return "redirect:/home";
        } catch (AuthenticationException e) {
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "账号或密码错误");
            return "redirect:/";
        }
    }

    /**
     * 登录后的页面
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    /**
     * 安全退出
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(RedirectAttributes redirectAttributes) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        redirectAttributes.addFlashAttribute("message", "您已安全退出");
        return "redirect:/";
    }
}
