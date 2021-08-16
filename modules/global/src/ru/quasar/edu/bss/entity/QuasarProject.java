package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "BSS_QUASAR_PROJECT")
@Entity(name = "bss_QuasarProject")
public class QuasarProject extends StandardEntity {
    private static final long serialVersionUID = -3676909785945707866L;

    @NotNull
    @Column(name = "PROJECT_NAME", nullable = false, unique = true)
    private String projectName;

    @Column(name = "AIM")
    private String aim;

    @Column(name = "SHORT_PROPOSAL")
    private String shortProposal;

    @Lob
    @Column(name = "PROPOSAL")
    private String proposal;

    @Lob
    @Column(name = "LONG_PROPOSAL")
    private String longProposal;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @NotNull
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BUSINESS_TYPE_ID")
    private BusinessType businessType;

    public BusinessType getBusinessType() {
        return businessType;
    }

    public void setBusinessType(BusinessType businessType) {
        this.businessType = businessType;
    }

    public String getLongProposal() {
        return longProposal;
    }

    public void setLongProposal(String longProposal) {
        this.longProposal = longProposal;
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    public String getShortProposal() {
        return shortProposal;
    }

    public void setShortProposal(String shortProposal) {
        this.shortProposal = shortProposal;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}