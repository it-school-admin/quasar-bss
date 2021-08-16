package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "BSS_COMPETITOR")
@Entity(name = "bss_Competitor")
public class Competitor extends StandardEntity {
    private static final long serialVersionUID = -1729873384896656950L;
}