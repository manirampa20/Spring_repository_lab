package com.entitymappinglab.entitymapping.repository;

import com.entitymappinglab.entitymapping.modules.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Custom query methods using method naming conventions

    // Find a department by its name
    List<Department> findByDepName(String depName);

    // Find all departments in a specific building
    List<Department> findByBuilding(String building);

    // Find all departments where the name contains a certain keyword (case-insensitive)
    List<Department> findByDepNameContainingIgnoreCase(String keyword);

    // Count the number of departments in a specific building


    // Find departments by building and department name
    List<Department> findByBuildingAndDepName(String building, String depName);

    // Find departments where the director's employee number is a specific value
    List<Department> findByDirector_EmNo(Long emNo);

    // Find departments where the name starts with a specific prefix
    List<Department> findByDepNameStartingWith(String prefix);

    // Find departments by building and director's first name
    List<Department> findByBuildingAndDirector_FirstName(String building, String firstName);

    // Find all departments in a specific building ordered by department name
    List<Department> findByBuildingOrderByDepNameAsc(String building);
}
