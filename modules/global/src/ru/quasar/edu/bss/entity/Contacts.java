package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "BSS_CONTACTS")
@Entity(name = "bss_Contacts")
@NamePattern("%s|contactName")
public class Contacts extends StandardEntity {
    private static final long serialVersionUID = -1130582405231069989L;

    @Column(name = "CONTACT_NAME")
    private String contactName;

    @ManyToMany
    @JoinTable(name = "BSS_CONTACTS_CONTACT_KIND_LINK",
            joinColumns = @JoinColumn(name = "CONTACTS_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONTACT_KIND_ID"))
    private List<ContactKind> contactKind;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CONTACT_DATA")
    private String contactData;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "director")
    private EducationalOrganization educationalOrganization;

    public EducationalOrganization getEducationalOrganization() {
        return educationalOrganization;
    }

    public void setEducationalOrganization(EducationalOrganization educationalOrganization) {
        this.educationalOrganization = educationalOrganization;
    }

    public void setContactKind(List<ContactKind> contactKind) {
        this.contactKind = contactKind;
    }

    public List<ContactKind> getContactKind() {
        return contactKind;
    }

    public String getContactData() {
        return contactData;
    }

    public void setContactData(String contactData) {
        this.contactData = contactData;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}