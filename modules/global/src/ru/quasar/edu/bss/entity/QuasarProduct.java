package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Table(name = "BSS_QUASAR_PRODUCT")
@Entity(name = "bss_QuasarProduct")
@NamePattern("%s|productName")
public class QuasarProduct extends StandardEntity {
    private static final long serialVersionUID = -7988618248410796508L;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @JoinTable(name = "BSS_QUASAR_PRODUCT_QUASAR_PRODUCT_LINK",
            joinColumns = @JoinColumn(name = "QUASAR_PRODUCT_1_ID"),
            inverseJoinColumns = @JoinColumn(name = "QUASAR_PRODUCT_2_ID"))
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToMany
    private Set<QuasarProduct> dependsOn;

    @Column(name = "AIM")
    private String aim;

    @Lob
    @Column(name = "BUSINESS_VALUE")
    private String businessValue;

    @JoinTable(name = "BSS_COMPETITOR_PRODUCT_QUASAR_PRODUCT_LINK",
            joinColumns = @JoinColumn(name = "QUASAR_PRODUCT_ID"),
            inverseJoinColumns = @JoinColumn(name = "COMPETITOR_PRODUCT_ID"))
    @ManyToMany
    private List<CompetitorProduct> competitorProducts;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DIRECTION_ID")
    private MainDirection direction;

    public String getBusinessValue() {
        return businessValue;
    }

    public void setBusinessValue(String businessValue) {
        this.businessValue = businessValue;
    }

    public MainDirection getDirection() {
        return direction;
    }

    public void setDirection(MainDirection direction) {
        this.direction = direction;
    }

    public List<CompetitorProduct> getCompetitorProducts() {
        return competitorProducts;
    }

    public void setCompetitorProducts(List<CompetitorProduct> competitorProducts) {
        this.competitorProducts = competitorProducts;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public Set<QuasarProduct> getDependsOn() {
        return dependsOn;
    }

    public void setDependsOn(Set<QuasarProduct> dependsOn) {
        this.dependsOn = dependsOn;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}