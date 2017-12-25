package com.springmvc.web;

import com.springmvc.entity.Users;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.annotation.Resource;

/**
 * Created by xiu on 2017/10/31.
 */
@Controller("userAction")
@RequestMapping("userAction")
public class UserAction {
    //注入userService
    @Resource(name = "userService")
    private UserService userService;

    //添加用户
    @RequestMapping("addUser")
    public String addUser(Users user, RedirectAttributes attr){
        if(!userService.addUser(user)){
            attr.addFlashAttribute("msg","添加失败");
        }
        return "redirect:/userAction/selectUser";
    }

    //删除用户
    @RequestMapping("deleteUser/{uno}")
    public String deleteUser(RedirectAttributes attr, @PathVariable int uno ){
        Users user = new Users();
        user.setUno(uno);
        if(!userService.deleteUser(user)){
            attr.addFlashAttribute("msg","删除失败");
        }
        return "redirect:/userAction/selectUser";
    }

    //修改用户
    @RequestMapping("updateUser")
    public String updateUser(Users user, RedirectAttributes attr){
        if(!userService.updateUser(user)){
            attr.addFlashAttribute("msg","修改失败");
        }
        return "redirect:/userAction/selectUser";
    }

    //查询单个用户
    @RequestMapping("selectUserById/{uno}")
    public String selectUserById(Model model, @PathVariable int uno){
        Users user = new Users();
        user.setUno(uno);
        model.addAttribute("users", userService.selectUserById(user));
        return "pages/updUser";
    }

    //查询所有用户
    @RequestMapping("selectUser")
    public String selectUser(Model model){
        model.addAttribute("userList", userService.selectUser());
        return "pages/userList";
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
