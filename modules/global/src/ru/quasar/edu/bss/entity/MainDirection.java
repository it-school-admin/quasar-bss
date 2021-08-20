package ru.quasar.edu.bss.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "BSS_MAIN_DIRECTION")
@Entity(name = "bss_MainDirection")
@NamePattern("%s|directionName")
public class MainDirection extends StandardEntity {
    private static final long serialVersionUID = -7812770471280508615L;

    @NotNull
    @Column(name = "DIRECTION_NAME", nullable = false, unique = true)
    private String directionName;

    @Lob
    @Column(name = "MISSION")
    private String mission;

    @JoinTable(name = "BSS_QUASAR_PROJECT_MAIN_DIRECTION_LINK",
            joinColumns = @JoinColumn(name = "MAIN_DIRECTION_ID"),
            inverseJoinColumns = @JoinColumn(name = "QUASAR_PROJECT_ID"))
    @ManyToMany
    private List<QuasarProject> quasarProjects;

    public List<QuasarProject> getQuasarProjects() {
        return quasarProjects;
    }

    public void setQuasarProjects(List<QuasarProject> quasarProjects) {
        this.quasarProjects = quasarProjects;
    }

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