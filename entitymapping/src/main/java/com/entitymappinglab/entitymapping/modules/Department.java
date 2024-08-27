package com.entitymappinglab.entitymapping.modules;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long depCode;

    private String depName;
    private String building;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Employee director;

    @OneToMany(mappedBy = "department")
    private Set<Ward> wards;

    // Getters and Setters
    public Long getDepCode() {
        return depCode;
    }

    public void setDepCode(Long depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public Employee getDirector() {
        return director;
    }

    public void setDirector(Employee director) {
        this.director = director;
    }

    public Set<Ward> getWards() {
        return wards;
    }

    public void setWards(Set<Ward> wards) {
        this.wards = wards;
    }
}
