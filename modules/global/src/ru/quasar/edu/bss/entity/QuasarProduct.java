package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Table(name = "BSS_QUASAR_PRODUCT")
@Entity(name = "bss_QuasarProduct")
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

    @NotNull
    @Column(name = "AIM", nullable = false)
    private String aim;

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