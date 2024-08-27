package com.entitymappinglab.entitymapping.modules;

import jakarta.persistence.*;

@Entity
@Table(name = "nurse")
public class Nurse extends Employee {

    private String salary;
    private String rotation;

    @ManyToOne
    @JoinColumn(name = "ward_id")
    private Ward ward;

    // Getters and Setters
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getRotation() {
        return rotation;
    }

    public void setRotation(String rotation) {
        this.rotation = rotation;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }
}
