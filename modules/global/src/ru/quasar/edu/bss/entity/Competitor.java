package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name = "BSS_COMPETITOR")
@Entity(name = "bss_Competitor")
@NamePattern("%s|name")
public class Competitor extends StandardEntity {
    private static final long serialVersionUID = -1729873384896656950L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "YEAR_BUDGET")
    private Integer yearBudget;

    @Column(name = "YEAR_PROFIT")
    private Integer yearProfit;

    @Column(name = "COST")
    private Integer cost;

    @Column(name = "FOUNDATION_DATE")
    private LocalDate foundationDate;

    @Column(name = "OFFICIAL_SITE")
    private String officialSite;

    @Column(name = "LINK_TO_RUS_PROFILE")
    private String linkToRusProfile;

    public void setYearBudget(Integer yearBudget) {
        this.yearBudget = yearBudget;
    }

    public Integer getYearBudget() {
        return yearBudget;
    }

    public String getLinkToRusProfile() {
        return linkToRusProfile;
    }

    public void setLinkToRusProfile(String linkToRusProfile) {
        this.linkToRusProfile = linkToRusProfile;
    }

    public String getOfficialSite() {
        return officialSite;
    }

    public void setOfficialSite(String officialSite) {
        this.officialSite = officialSite;
    }

    public LocalDate getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getYearProfit() {
        return yearProfit;
    }

    public void setYearProfit(Integer yearProfit) {
        this.yearProfit = yearProfit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}