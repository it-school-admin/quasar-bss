package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "BSS_COMPETITOR_PRODUCT")
@Entity(name = "bss_CompetitorProduct")
public class CompetitorProduct extends StandardEntity {
    private static final long serialVersionUID = -4368131315179602006L;

    @NotNull
    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPETITOR_ID")
    private Competitor competitor;

    @JoinTable(name = "BSS_COMPETITOR_PRODUCT_QUASAR_PRODUCT_LINK",
            joinColumns = @JoinColumn(name = "COMPETITOR_PRODUCT_ID"),
            inverseJoinColumns = @JoinColumn(name = "QUASAR_PRODUCT_ID"))
    @ManyToMany
    private List<QuasarProduct> quasarProduct;

    public List<QuasarProduct> getQuasarProduct() {
        return quasarProduct;
    }

    public void setQuasarProduct(List<QuasarProduct> quasarProduct) {
        this.quasarProduct = quasarProduct;
    }

    public Competitor getCompetitor() {
        return competitor;
    }

    public void setCompetitor(Competitor competitor) {
        this.competitor = competitor;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}