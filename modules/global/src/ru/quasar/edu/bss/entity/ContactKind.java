package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@Table(name = "BSS_CONTACT_KIND")
@Entity(name = "bss_ContactKind")
@NamePattern("%s|name")
public class ContactKind extends StandardEntity {
    private static final long serialVersionUID = -3481296263003863069L;

    @Column(name = "NAME")
    private String name;

    @JoinTable(name = "BSS_CONTACTS_CONTACT_KIND_LINK",
            joinColumns = @JoinColumn(name = "CONTACT_KIND_ID"),
            inverseJoinColumns = @JoinColumn(name = "CONTACTS_ID"))
    @ManyToMany
    private List<Contacts> contactses;

    public List<Contacts> getContactses() {
        return contactses;
    }

    public void setContactses(List<Contacts> contactses) {
        this.contactses = contactses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}