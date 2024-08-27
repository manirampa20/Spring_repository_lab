package com.entitymappinglab.entitymapping.modules;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor extends Employee {

    private String specialty;

    // Getters and Setters
    public String getSpecialty() {

        return specialty;
    }

    public void setSpecialty(String specialty) {

        this.specialty = specialty;
    }
}
