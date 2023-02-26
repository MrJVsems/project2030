package ru.samples.sample1.repository;

import ru.samples.sample1.entity.Vacancies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VacancyRepository extends JpaRepository<Vacancies, Integer> {

}