package ru.samples.sample1.repository;

import org.springframework.data.jpa.repository.Query;
import ru.samples.sample1.entity.Specialties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.samples.sample1.entity.Vacancies_PI;

import java.util.List;

@Repository
public interface Specialties_Repository extends JpaRepository<Specialties, Integer> {
    List<Specialties> findBySpecialtyidBefore(int specialtyid);
}
