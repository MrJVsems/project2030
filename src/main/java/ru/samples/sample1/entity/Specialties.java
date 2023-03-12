package ru.samples.sample1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Specialties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer specialtyid;

    private String name;

    private String code;

    private String vacanciestablename;

    public Specialties() {
    }

    public Specialties(Integer specialtyid, String name, String code,  String vacanciestablename) {

        this.specialtyid = specialtyid;
        this.name = name;
        this.code = code;
        this.vacanciestablename = vacanciestablename;
    }

    public Integer getSpecialtyid() {
        return specialtyid;
    }

    public void setSpecialtyid(Integer specialtyid) {
        this.specialtyid = specialtyid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVacanciestablename() {
        return vacanciestablename;
    }

    public void setVacanciestablename(String vacanciesTableName) {
        this.vacanciestablename = vacanciesTableName;
    }
}
