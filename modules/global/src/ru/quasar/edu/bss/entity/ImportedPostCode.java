package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "BSS_IMPORTED_POST_CODE_1")
@Entity(name = "bss_ImportedPostCode")
public class ImportedPostCode extends StandardEntity {
    private static final long serialVersionUID = -3722051610129200384L;

    @NotNull
    @Column(name = "POST_INDEX", nullable = false, unique = true, length = 6)
    private String postIndex;

    @Column(name = "OPS_NAME")
    private String opsName;

    @Column(name = "OPS_TYPE")
    private String opsType;

    @Column(name = "PARENT_CODE")
    private String parentCode;

    @Column(name = "AUTONOM")
    private String autonom;

    @Column(name = "AREA")
    private String area;

    @Column(name = "CITY")
    private String city;

    @Column(name = "SUB_CITY")
    private String subCity;

    @Column(name = "ACT_DATE")
    private String actDate;

    @Column(name = "INDEX_OLD", length = 8)
    private String indexOld;

    public String getActDate() {
        return actDate;
    }

    public void setActDate(String actDate) {
        this.actDate = actDate;
    }

    public String getIndexOld() {
        return indexOld;
    }

    public void setIndexOld(String indexOld) {
        this.indexOld = indexOld;
    }

    public String getSubCity() {
        return subCity;
    }

    public void setSubCity(String subCity) {
        this.subCity = subCity;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAutonom() {
        return autonom;
    }

    public void setAutonom(String autonom) {
        this.autonom = autonom;
    }

    public String getOpsType() {
        return opsType;
    }

    public void setOpsType(String opsType) {
        this.opsType = opsType;
    }

    public String getOpsName() {
        return opsName;
    }

    public void setOpsName(String opsName) {
        this.opsName = opsName;
    }

    public String getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(String postIndex) {
        this.postIndex = postIndex;
    }
}