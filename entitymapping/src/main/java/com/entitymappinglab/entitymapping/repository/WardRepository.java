package com.entitymappinglab.entitymapping.repository;

import com.entitymappinglab.entitymapping.modules.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardRepository extends JpaRepository<Ward, Long> {
    // Custom query methods can be defined here
}
