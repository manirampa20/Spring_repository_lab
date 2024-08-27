package com.entitymappinglab.entitymapping.repository;

import com.entitymappinglab.entitymapping.modules.Hospitalisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalisationRepository extends JpaRepository<Hospitalisation, Long> {
    // Define custom queries if needed
}
