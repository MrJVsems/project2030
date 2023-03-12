package ru.samples.sample1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vacancies_Pribor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer vacancyid;

    private Integer serviceid;

    private String id;

    private String url;

    private String publishedat;

    private String name;

    private Integer salaryfrom;

    private Integer salaryto;

    private String currency;

    private String country;

    private String area;

    private String town;

    private Float latitude;

    private Float longitude;

    private String firmname;

    private Character trial545;

    public Vacancies_Pribor() {
    }

    public Vacancies_Pribor(Integer vacancyid, Integer serviceid, String id, String url, String publishedat, String name,
                            Integer salaryfrom, Integer salaryto, String currency, String country, String area, String town,
                            Float latitude, Float longitude, String firmname, Character trial545) {

        this.vacancyid = vacancyid;
        this.serviceid = serviceid;
        this.id = id;
        this.url = url;
        this.publishedat = publishedat;
        this.name = name;
        this.salaryfrom = salaryfrom;
        this.salaryto = salaryto;
        this.currency = currency;
        this.country = country;
        this.area = area;
        this.town = town;
        this.latitude = latitude;
        this.longitude = longitude;
        this.firmname = firmname;
        this.trial545 = trial545;
    }

    public Integer getVacancyid() {
        return vacancyid;
    }

    public void setVacancyid(Integer vacancyid) {
        this.vacancyid = vacancyid;
    }

    public Integer getServiceid() {
        return serviceid;
    }

    public void setServiceid(Integer serviceid) {
        this.serviceid = serviceid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPublishedat() {
        return publishedat;
    }

    public void setPublishedat(String publishedat) {
        this.publishedat = publishedat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalaryfrom() {
        return salaryfrom;
    }

    public void setSalaryfrom(Integer salaryfrom) {
        this.salaryfrom = salaryfrom;
    }

    public Integer getSalaryto() {
        return salaryto;
    }

    public void setSalaryto(Integer salaryto) {
        this.salaryto = salaryto;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getFirmname() {
        return firmname;
    }

    public void setFirmname(String firmname) {
        this.firmname = firmname;
    }

    public Character getTrial545() {
        return trial545;
    }

    public void setTrial545(Character trial545) {
        this.trial545 = trial545;
    }
}