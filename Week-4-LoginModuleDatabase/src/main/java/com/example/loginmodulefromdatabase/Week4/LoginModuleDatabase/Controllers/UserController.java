package com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Entitys.CompanyUser;
import com.example.loginmodulefromdatabase.Week4.LoginModuleDatabase.Repositories.UserRepository;

@Controller
public class UserController {
	@Autowired
    private UserRepository userRepo;

    @GetMapping("/index")
    public String viewHomePage() {
        return "index";
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new CompanyUser());

        return "signup_form";
    }
    @PostMapping("/process_register")
    public String processRegister(CompanyUser user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        userRepo.save(user);

        return "register_success";
    }
    @GetMapping("/users")
    public String listUsers(Model model) {
        List<CompanyUser> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }
}

