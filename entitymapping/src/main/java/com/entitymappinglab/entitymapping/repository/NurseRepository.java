package com.entitymappinglab.entitymapping.repository;

import com.entitymappinglab.entitymapping.modules.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseRepository extends JpaRepository<Nurse, Long> {
    // Define custom queries if needed
}
