package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "BSS_COMPETITOR_PRODUCT")
@Entity(name = "bss_CompetitorProduct")
@NamePattern("%s|productName")
public class CompetitorProduct extends StandardEntity {
    private static final long serialVersionUID = -4368131315179602006L;

    @NotNull
    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PRICE_WITHOUT_TIME_LIMITS")
    private Integer priceWithoutTimeLimits;

    @Column(name = "PRICE_PER_YEAR")
    private Integer pricePerYear;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPETITOR_ID")
    private Competitor competitor;

    @JoinTable(name = "BSS_COMPETITOR_PRODUCT_QUASAR_PRODUCT_LINK",
            joinColumns = @JoinColumn(name = "COMPETITOR_PRODUCT_ID"),
            inverseJoinColumns = @JoinColumn(name = "QUASAR_PRODUCT_ID"))
    @ManyToMany
    private List<QuasarProduct> quasarProduct;

    @Column(name = "SALES")
    private Integer sales;

    @Column(name = "SITE_LINK")
    private String siteLink;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_PRODUCT_ID")
    private CompetitorProduct parentProduct;

    public void setPriceWithoutTimeLimits(Integer priceWithoutTimeLimits) {
        this.priceWithoutTimeLimits = priceWithoutTimeLimits;
    }

    public Integer getPriceWithoutTimeLimits() {
        return priceWithoutTimeLimits;
    }

    public Integer getPricePerYear() {
        return pricePerYear;
    }

    public void setPricePerYear(Integer pricePerYear) {
        this.pricePerYear = pricePerYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CompetitorProduct getParentProduct() {
        return parentProduct;
    }

    public void setParentProduct(CompetitorProduct parentProduct) {
        this.parentProduct = parentProduct;
    }

    public String getSiteLink() {
        return siteLink;
    }

    public void setSiteLink(String siteLink) {
        this.siteLink = siteLink;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

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