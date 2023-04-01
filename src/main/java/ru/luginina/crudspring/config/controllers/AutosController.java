package ru.luginina.crudspring.config.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.luginina.crudspring.AutoDao.AutoDao;
import ru.luginina.crudspring.models.Auto;

@Controller
@RequestMapping("/auto")
public class AutosController {
    private final AutoDao autoDao;
    @Autowired
    //связали компонент и контроллер
    public AutosController(AutoDao autoDao){
        this.autoDao = autoDao;
    }

    @GetMapping()
    public String index(Model model){
        //получаем автопарк из ДАО (бд) и передаем в представление
        model.addAttribute("autos", autoDao.index());
        return "auto/index";
    }
    @GetMapping("/{id}")
    public  String show(@PathVariable("id") int id, Model model){
        //получим 1 авто по id из ДАО и передадим на отображение в представление
       model.addAttribute("auto", autoDao.show(id));
        return "auto/show";
    }
    @GetMapping("/new")
    public String newAuto(@ModelAttribute("auto")Auto auto){

        return"auto/new";
    }
    @PostMapping
    public String create(@ModelAttribute("auto") Auto auto){

        autoDao.save(auto);
        return "redirect:/auto";
    }

}
