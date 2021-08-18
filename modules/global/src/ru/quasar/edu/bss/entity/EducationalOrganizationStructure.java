package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "BSS_EDUCATIONAL_ORGANIZATION_STRUCTURE")
@Entity(name = "bss_EducationalOrganizationStructure")
@NamePattern("%s|name")
public class EducationalOrganizationStructure extends StandardEntity {
    private static final long serialVersionUID = 8174470780687079600L;

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "NAME")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIRECTOR_ID")
    private Contacts director;

    @Column(name = "SITE")
    private String site;

    @Column(name = "ADDRESS")
    private String address;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "EDUCATIONAL_ORGANIZATIONS_ID")
    private EducationalOrganizations educationalOrganizations;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EducationalOrganizations getEducationalOrganizations() {
        return educationalOrganizations;
    }

    public void setEducationalOrganizations(EducationalOrganizations educationalOrganizations) {
        this.educationalOrganizations = educationalOrganizations;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Contacts getDirector() {
        return director;
    }

    public void setDirector(Contacts director) {
        this.director = director;
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