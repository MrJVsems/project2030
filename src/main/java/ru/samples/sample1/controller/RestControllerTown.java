package ru.samples.sample1.controller;

import java.util.List;

import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import ru.samples.sample1.service.Vacancy_PI_Service;
import ru.samples.sample1.message.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.samples.sample1.service.Vacancy_Pribor_Service;


@RestController
@RequestMapping("/api/towncount")
public class RestControllerTown{
    @Autowired
    private Vacancy_PI_Service vacancyService;

    @Autowired
    private Vacancy_Pribor_Service vacancy_pribor_service;

    @GetMapping(value = "/vacancies_pi")
    public Response getResource() {
        List<Object[]> TownCount= vacancyService.getCount();
        String jsonStr = JSONArray.toJSONString(TownCount);
        Response response = new Response("Done", jsonStr);
        return response;
    }
    @GetMapping(value = "/vacancies_pribor")
    public Response getTownCount() {
        List<Object[]> TownCount= vacancy_pribor_service.getCount();
        String jsonStr = JSONArray.toJSONString(TownCount);
        Response response = new Response("Done", jsonStr);
        return response;
    }

}
