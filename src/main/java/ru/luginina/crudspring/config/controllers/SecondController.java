package ru.luginina.crudspring.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/second")//указываем путь к странице представления
public class SecondController {
    @GetMapping("/exit")
    public String Exit(){
        return "second/exit";
    }
}
