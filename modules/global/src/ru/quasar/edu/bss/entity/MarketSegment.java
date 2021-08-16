package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "BSS_MARKET_SEGMENT")
@Entity(name = "bss_MarketSegment")
public class MarketSegment extends StandardEntity {
    private static final long serialVersionUID = -3642293220240984446L;
}