package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Table(name = "BSS_EDUCATIONAL_ORGANIZATION")
@Entity(name = "bss_EducationalOrganization")
@NamePattern("%s|shortName")
public class EducationalOrganization extends StandardEntity {
    private static final long serialVersionUID = -8607809553496460303L;

    @NotNull
    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean isActive = false;

    @Column(name = "SHORT_NAME", nullable = false)
    @NotNull
    private String shortName;

    @Lob
    @Column(name = "NAME")
    private String name;

    @Column(name = "INN")
    private String inn;

    @Column(name = "OGRN")
    private String ogrn;

    @Column(name = "SCHOOL_GUID", unique = true)
    private UUID schoolGuid;

    @Column(name = "EMAIL")
    @Email
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "SITE")
    private String site;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIRECTOR_ID")
    private Contacts director;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "REGION_ID")
    private Region region;

    @JoinColumn(name = "AREA_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Area area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY_ID")
    private City city;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUB_CITY_ID")
    private SubCity subCity;

    public SubCity getSubCity() {
        return subCity;
    }

    public void setSubCity(SubCity subCity) {
        this.subCity = subCity;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Area getArea() {
        return area;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Contacts getDirector() {
        return director;
    }

    public void setDirector(Contacts director) {
        this.director = director;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getSchoolGuid() {
        return schoolGuid;
    }

    public void setSchoolGuid(UUID schoolGuid) {
        this.schoolGuid = schoolGuid;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}