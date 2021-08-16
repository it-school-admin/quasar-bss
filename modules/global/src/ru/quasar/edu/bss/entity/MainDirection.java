package ru.quasar.edu.bss.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "BSS_MAIN_DIRECTION")
@Entity(name = "bss_MainDirection")
public class MainDirection extends StandardEntity {
    private static final long serialVersionUID = -7812770471280508615L;

    @NotNull
    @Column(name = "DIRECTION_NAME", nullable = false, unique = true)
    private String directionName;

    @Lob
    @Column(name = "MISSION")
    private String mission;

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }
}