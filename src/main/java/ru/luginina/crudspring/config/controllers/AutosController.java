package ru.luginina.crudspring.config.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.luginina.crudspring.AutoDao.AutoDao;

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
}
