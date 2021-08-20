package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "BSS_BUSINESS_TYPE")
@Entity(name = "bss_BusinessType")
@NamePattern("%s|businessTypeName")
public class BusinessType extends StandardEntity {
    private static final long serialVersionUID = -5980739344483209353L;

    @Column(name = "BUSINESS_TYPE_NAME")
    private String businessTypeName;

    public String getBusinessTypeName() {
        return businessTypeName;
    }

    public void setBusinessTypeName(String businessTypeName) {
        this.businessTypeName = businessTypeName;
    }
}