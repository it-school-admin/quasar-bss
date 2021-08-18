package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;

@Table(name = "BSS_EDUCATIONAL_ORGANIZATIONS")
@Entity(name = "bss_EducationalOrganizations")
@NamePattern("%s|name")
public class EducationalOrganizations extends StandardEntity {
    private static final long serialVersionUID = 1990967569781220278L;

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "SITE")
    private String site;

    @JoinColumn(name = "DIRECTOR_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private Contacts director;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "educationalOrganizations")
    private List<EducationalOrganizationStructure> structureElements;

    public List<EducationalOrganizationStructure> getStructureElements() {
        return structureElements;
    }

    public void setStructureElements(List<EducationalOrganizationStructure> structureElements) {
        this.structureElements = structureElements;
    }

    public void setDirector(Contacts director) {
        this.director = director;
    }

    public Contacts getDirector() {
        return director;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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