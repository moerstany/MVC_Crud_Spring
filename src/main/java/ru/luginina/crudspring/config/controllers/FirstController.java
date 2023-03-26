package ru.luginina.crudspring.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
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
