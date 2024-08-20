package com.aksoyakin.jobportalapp.controller;

import com.aksoyakin.jobportalapp.entity.Users;
import com.aksoyakin.jobportalapp.entity.UsersType;
import com.aksoyakin.jobportalapp.services.UsersService;
import com.aksoyakin.jobportalapp.services.UsersTypeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UsersController {

    private final UsersTypeService usersTypeService;
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersTypeService usersTypeService, UsersService usersService) {
        this.usersTypeService = usersTypeService;
        this.usersService = usersService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        List<UsersType> usersTypes = usersTypeService.getAllUsersTypes();
        model.addAttribute("getAllTypes", usersTypes);
        model.addAttribute("user", new Users());
        return "register";
    }

    @PostMapping("/register/new")
    public String userRegistration(@Valid Users users) {
//        System.out.println("User:: " + users);
        usersService.addNew(users);
        return "dashboard";
    }
}
