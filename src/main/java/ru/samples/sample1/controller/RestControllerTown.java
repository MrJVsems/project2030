package ru.samples.sample1.controller;

import java.util.ArrayList;
import java.util.List;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import ru.samples.sample1.service.VacancyService;
import ru.samples.sample1.message.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/towncount")
public class RestControllerTown{
    @Autowired
    private VacancyService vacancyService;

    @GetMapping(value = "/all")
    public Response getResource() {
        List<Object[]> TownCount= vacancyService.getCount();
        String jsonStr = JSONArray.toJSONString(TownCount);
        Response response = new Response("Done", jsonStr);
        return response;
    }

}
