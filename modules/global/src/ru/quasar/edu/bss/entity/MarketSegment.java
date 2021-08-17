package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "BSS_MARKET_SEGMENT")
@Entity(name = "bss_MarketSegment")
public class MarketSegment extends StandardEntity {
    private static final long serialVersionUID = -3642293220240984446L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BUSINESS_TYPE_ID")
    private BusinessType businessType;

    @Column(name = "SEGMENT_NAME")
    private String segmentName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_SEGMENT_ID")
    private MarketSegment parentSegment;

    public MarketSegment getParentSegment() {
        return parentSegment;
    }

    public void setParentSegment(MarketSegment parentSegment) {
        this.parentSegment = parentSegment;
    }

    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }
}