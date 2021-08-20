package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "BSS_FUND")
@Entity(name = "bss_Fund")
@NamePattern("%s|name")
public class Fund extends StandardEntity {
    private static final long serialVersionUID = -6194114039691169874L;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "SHORT_NAME")
    private String shortName;

    @Column(name = "SITELINK")
    private String sitelink;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getSitelink() {
        return sitelink;
    }

    public void setSitelink(String sitelink) {
        this.sitelink = sitelink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}