package ru.samples.sample1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.samples.sample1.entity.Specialties;
import ru.samples.sample1.repository.Specialties_Repository;

import java.util.List;

@Service
public class Specialties_Service {

    @Autowired
    private Specialties_Repository specialtiesRepository;

    public List<Specialties> getAll() {
        return specialtiesRepository.findBySpecialtyidBefore(5);
    }
}