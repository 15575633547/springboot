package com.example.demo1.controller;



import java.util.List;

import com.example.demo1.pojo.User;
import com.example.demo1.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/listUser")
    public String listUser(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "listUser";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "/addUser";
    }

    @RequestMapping("/add")
    public String addUser(User user) {
        userService.addUser(user);
        return "redirect:/listUser";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(Model model, int id) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "/updateUser";
    }

    @RequestMapping("/update")
    public String updateUser(User user) {
        userService.updateUser(user);
        return "redirect:/listUser";
    }

    @RequestMapping("/delete")
    public String deleteUser(int id) {
        userService.deleteUser(id);
        return "redirect:/listUser";
    }
}