package ru.luginina.crudspring.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
//контроллер
public class FirstController {
    // методы
    @GetMapping("/hello")
    public String HelloPage(){
      return "first/hello";
    }
    @GetMapping("/goodbye")
    public String GoodbyePage(){
      return "first/goodbye";
    }

}
