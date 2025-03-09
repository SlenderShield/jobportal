package com.mdb.jobportal.controller;


import com.mdb.jobportal.entity.UserType;
import com.mdb.jobportal.entity.Users;
import com.mdb.jobportal.services.UsersService;
import com.mdb.jobportal.services.UsersTypeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class UsersController {

    private final UsersTypeService usersTypeService;
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersTypeService usersTypeService, UsersService usersService) {
        this.usersService = usersService;
        this.usersTypeService = usersTypeService;
    }

    @GetMapping("/register")
    public String register(Model model){
        List<UserType> usersTypes = usersTypeService.getAll();
        model.addAttribute("getAllTypes",usersTypes);
        model.addAttribute("user",new Users());
        return "register";
    }
    @PostMapping("/register/new")
    public String userRegistration(@Valid Users user, Model model){
//        System.out.println("User Registration: " + user);

        Optional<Users> optionalUsers = usersService.getUsersByEmail(user.getEmail());

        if(optionalUsers.isPresent()){
            model.addAttribute("error","Email already registered, try to login or register with other email.");
            List<UserType> usersTypes = usersTypeService.getAll();
            model.addAttribute("getAllTypes",usersTypes);
            model.addAttribute("user",new Users());
            return "register";
        }

        usersService.addNew(user);


        return "dashboard";
    }
}
