package com.entitymappinglab.entitymapping.modules;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientNo;

    private String name;
    private String surname;
    private String telNo;
    private String address;

    @OneToMany(mappedBy = "patient")
    private Set<Hospitalisation> hospitalisations;

    // Getters and Setters
    public Long getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(Long patientNo) {
        this.patientNo = patientNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Hospitalisation> getHospitalisations() {
        return hospitalisations;
    }

    public void setHospitalisations(Set<Hospitalisation> hospitalisations) {
        this.hospitalisations = hospitalisations;
    }
}
