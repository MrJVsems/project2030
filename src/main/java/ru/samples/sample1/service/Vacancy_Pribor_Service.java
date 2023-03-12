package ru.samples.sample1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.samples.sample1.entity.Vacancies_Pribor;
import ru.samples.sample1.repository.Vacancy_Pribor_Repository;

import java.util.List;

@Service
public class Vacancy_Pribor_Service {

    @Autowired
    private Vacancy_Pribor_Repository vacancyPriborRepository;
    public List<Vacancies_Pribor> getAll() {
        return vacancyPriborRepository.findAll();
    }
    public List<Object[]> getCount() {
        return vacancyPriborRepository.countTotalVacancies();
    }
}