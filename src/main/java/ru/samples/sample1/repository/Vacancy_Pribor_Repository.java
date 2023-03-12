package ru.samples.sample1.repository;

import org.springframework.data.jpa.repository.Query;
import ru.samples.sample1.entity.Vacancies_Pribor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Vacancy_Pribor_Repository extends JpaRepository<Vacancies_Pribor, Integer> {

    @Query("SELECT count(v.vacancyid) AS VacCount, v.town "
            + "FROM Vacancies_Pribor AS v GROUP BY v.town "
            + "HAVING count(v.vacancyid) >= 50 "
            + "ORDER BY count(v.vacancyid) DESC")
    List<Object[]> countTotalVacancies();
}
