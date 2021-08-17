package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "BSS_FEATURE")
@Entity(name = "bss_Feature")
@NamePattern("%s|description")
public class Feature extends StandardEntity {
    private static final long serialVersionUID = -5181147861110757971L;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_FEATURE_ID")
    private Feature parentFeature;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private QuasarProduct product;

    public QuasarProduct getProduct() {
        return product;
    }

    public void setProduct(QuasarProduct product) {
        this.product = product;
    }

    public Feature getParentFeature() {
        return parentFeature;
    }

    public void setParentFeature(Feature parentFeature) {
        this.parentFeature = parentFeature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}