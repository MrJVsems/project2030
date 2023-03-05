package ru.samples.sample1.repository;

import org.springframework.data.jpa.repository.Query;
import ru.samples.sample1.entity.Vacancies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VacancyRepository extends JpaRepository<Vacancies, Integer> {

    List<Vacancies> findByVacancyidBefore(int vacancyid);

    @Query("SELECT count(v.vacancyid) AS VacCount, v.town "
            + "FROM Vacancies AS v GROUP BY v.town "
            + "HAVING count(v.vacancyid) >= 50 "
            + "ORDER BY count(v.vacancyid) DESC")
    List<Object[]> countTotalVacancies();
}