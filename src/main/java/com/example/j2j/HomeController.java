package com.example.j2j;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFromPage(){
        return "formtemplate";
    }
    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("login") String login, Model model){
        model.addAttribute("loginval", login);
        return "confirm";
    }
}

// "login" -> name of input
// String is data type
// login is the particular String?
// Model is class; model is object ...
// model.addAttribute(variable, ... the value is login,
// In other words, we request the parameter of an input,
// identify it by name, identify the data type, ...
// not sure what login is, but we need a Model/model
// to put that login into the var "loginval"