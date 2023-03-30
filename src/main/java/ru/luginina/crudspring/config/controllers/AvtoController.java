package ru.luginina.crudspring.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/avto")
public class AvtoController {
    @GetMapping()
    public String index(Model model){
        //получаем автопарк из ДАО (бд) и передаем в представление
        return null;
    }
    @GetMapping("/{id}")
    public  String show(@PathVariable("id")int id,Model model){
        //получим 1 авто по id из ДАО и передадим на отображение в представление
        return  null;
    }
}
