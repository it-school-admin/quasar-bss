package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "BSS_GRANT")
@Entity(name = "bss_Grant")
@NamePattern("%s|name")
public class Grant extends StandardEntity {
    private static final long serialVersionUID = -7832741024210445283L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AMOUNT")
    private Integer amount;

    @Column(name = "GRANT_DATE")
    private String grantDate;

    @NotNull
    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FUND_ID")
    private Fund fund;

    @Column(name = "SITELINK")
    private String sitelink;

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public Fund getFund() {
        return fund;
    }

    public void setFund(Fund fund) {
        this.fund = fund;
    }

    public String getGrantDate() {
        return grantDate;
    }

    public void setGrantDate(String grantDate) {
        this.grantDate = grantDate;
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