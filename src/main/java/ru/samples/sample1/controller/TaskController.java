package ru.samples.sample1.controller;

import org.springframework.http.MediaType;
import ru.samples.sample1.entity.Task;
import ru.samples.sample1.service.TaskService;

import ru.samples.sample1.entity.Vacancies;
import ru.samples.sample1.service.VacancyService;

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
    private VacancyService vacancyService;

    @GetMapping("/")
    public String getAll(Model model) {
        List<Vacancies> vacanciesList = vacancyService.getAll();
        List<Object[]> TownCount= vacancyService.getCount();
        model.addAttribute("vacanciesList", vacanciesList);
        model.addAttribute("vacanciesSize", vacanciesList.size());
        model.addAttribute("townCount", TownCount);
        return "index.html";
    }
    @GetMapping("/getCount")
    public String getCount(Model model) {
        List<Object[]> TownCount= vacancyService.getCount();
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