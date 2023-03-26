package ru.luginina.crudspring.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
//контроллер
public class FirstController {
    // методы
    @GetMapping("/hello")
    public String HelloPage(HttpServletRequest request, Model model )/*внедрили объект для гет запросов в метод*/{
      String name = request.getParameter("name");
      String surname=request.getParameter("surname");
      //System.out.println("Hello " + name +" "+ surname);
        //внедрили модель и обращаемся к ней для отображения гет запроса
        model.addAttribute("message","Hello " + name +" "+ surname);
        return "first/hello";
    }
    @GetMapping("/goodbye")
    //делаем гет запрос к серверу через аннотацию реквест парам, реквайред фалс чтобы при 0 значениях не выпрыгивала ошибка
    public String GoodbyePage(@RequestParam(value="name", required = false)String name,
                              @RequestParam (value="surname",required = false) String surname,
                              Model model){

        //System.out.println("Hello " + name +" "+ surname);
        model.addAttribute("message1","Hello " + name +" "+ surname);
        return "first/goodbye";
    }

}
