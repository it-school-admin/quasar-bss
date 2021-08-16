package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "BSS_BUSINESS_TYPE")
@Entity(name = "bss_BusinessType")
public class BusinessType extends StandardEntity {
    private static final long serialVersionUID = -5980739344483209353L;
}