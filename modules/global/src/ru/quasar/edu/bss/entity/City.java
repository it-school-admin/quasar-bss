package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "BSS_CITY")
@Entity(name = "bss_City")
public class City extends StandardEntity {
    private static final long serialVersionUID = -2426959103777774054L;
}