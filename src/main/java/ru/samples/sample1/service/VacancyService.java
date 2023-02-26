package ru.samples.sample1.service;

import ru.samples.sample1.entity.Vacancies;
import ru.samples.sample1.repository.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyService {

    @Autowired
    private VacancyRepository vacancyRepository;

    public List<Vacancies> getAll() {
        return vacancyRepository.findAll();
    }

//    public Task save(Task task) {
//        return taskRepository.save(task);
//    }
//
//    public void delete(int id) {
//        taskRepository.deleteById(id);
//    }
}