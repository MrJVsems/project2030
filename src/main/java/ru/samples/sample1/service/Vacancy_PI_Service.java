package ru.samples.sample1.service;

import ru.samples.sample1.entity.Vacancies_PI;
import ru.samples.sample1.repository.Vacancy_PI_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Vacancy_PI_Service {

    @Autowired
    private Vacancy_PI_Repository vacancyRepository;

    public List<Vacancies_PI> getAll() {
        return vacancyRepository.findByVacancyidBefore(7000);
    }
    public List<Object[]> getCount() {
        return vacancyRepository.countTotalVacancies();
    }
}