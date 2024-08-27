package com.entitymappinglab.entitymapping.repository;

import com.entitymappinglab.entitymapping.modules.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Define custom queries if needed
}
