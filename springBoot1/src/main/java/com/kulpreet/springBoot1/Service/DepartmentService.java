package com.kulpreet.springBoot1.Service;

import com.kulpreet.springBoot1.DTO.Department;
import com.kulpreet.springBoot1.Dao.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments(){
        List<Department> departments = new ArrayList<>();
        departmentRepository.findAll().forEach(departments::add);
        return departments;
    }

    public Department getDepartment(long id) {
        return departmentRepository.findById(id).get();
    }

    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    public void updateDepartment(long id, Department department) {
        departmentRepository.save(department);
    }

    public void deleteDepartment(long id) {
        departmentRepository.deleteById(id);
    }
}
