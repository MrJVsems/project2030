package ru.samples.sample1.controller;

import ru.samples.sample1.entity.Specialties;
import ru.samples.sample1.entity.Vacancies_PI;
import ru.samples.sample1.service.Vacancy_PI_Service;
import ru.samples.sample1.service.Specialties_Service;

import org.springframework.boot.autoconfigure.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@EnableAutoConfiguration
public class TaskController {

    @Autowired
    private Vacancy_PI_Service vacancyPiService;
    @Autowired
    private Specialties_Service specialtiesService;

    @GetMapping("/")
    public String getAll(Model model) {
        List<Vacancies_PI> vacanciesList = vacancyPiService.getAll();
        List<Object[]> TownCount= vacancyPiService.getCount();
        List<Specialties> SpecialtyList = specialtiesService.getAll();
        model.addAttribute("specList", SpecialtyList);
        model.addAttribute("townCount", TownCount);
        return "index.html";
    }
    @GetMapping("/getCount")
    public String getCount(Model model) {
        List<Object[]> TownCount= vacancyPiService.getCount();
        model.addAttribute("townCount", TownCount);
        return null;
    }


//    @RequestMapping("/delete/{id}")
//    public String deleteTask(@PathVariable int id) {
//        taskService.delete(id);
//        return "redirect:/";
//    }
//
//    @PostMapping("/add")
//    public String addTask(@ModelAttribute Task task) {
//        taskService.save(task);
//        return "redirect:/";
//    }
}