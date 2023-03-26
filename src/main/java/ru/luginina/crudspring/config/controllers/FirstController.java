package ru.luginina.crudspring.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
//контроллер
public class FirstController {
    // методы
    @GetMapping("/hello")
    public String HelloPage(HttpServletRequest request )/*внедрили объект для гет запросов в метод*/{
      String name = request.getParameter("name");
      String surname=request.getParameter("surname");
      System.out.println("Hello" + name + surname);
        return "first/hello";
    }
    @GetMapping("/goodbye")
    public String GoodbyePage(){
      return "first/goodbye";
    }

}
