package com.entitymappinglab.entitymapping.services;

import com.entitymappinglab.entitymapping.modules.Department;
import com.entitymappinglab.entitymapping.modules.Employee;

import com.entitymappinglab.entitymapping.repository.DepartmentRepository;
import com.entitymappinglab.entitymapping.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    // Create a new Department
    public Department createDepartment(Department department) {
        if (department.getDirector() != null) {
            Long directorEmNo = department.getDirector().getEmNo();  // Updated to use emNo
            Employee director = employeeRepository.findById(directorEmNo)
                    .orElseThrow(() -> new RuntimeException("Director not found with emNo: " + directorEmNo));
            department.setDirector(director);
        }
        return departmentRepository.save(department);
    }

    // Get a Department by ID
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + id));
    }

    // Get all Departments
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    // Update an existing Department
    public Department updateDepartment(Long id, Department updatedDepartment) {
        Department department = getDepartmentById(id);
        department.setDepName(updatedDepartment.getDepName());
        department.setBuilding(updatedDepartment.getBuilding());

        if (updatedDepartment.getDirector() != null) {
            Long directorEmNo = updatedDepartment.getDirector().getEmNo();  // Updated to use emNo
            Employee director = employeeRepository.findById(directorEmNo)
                    .orElseThrow(() -> new RuntimeException("Director not found with emNo: " + directorEmNo));
            department.setDirector(director);
        }

        return departmentRepository.save(department);
    }

    // Delete a Department by ID
    public void deleteDepartment(Long id) {
        if (!departmentRepository.existsById(id)) {
            throw new RuntimeException("Department not found with id: " + id);
        }
        departmentRepository.deleteById(id);
    }
}
