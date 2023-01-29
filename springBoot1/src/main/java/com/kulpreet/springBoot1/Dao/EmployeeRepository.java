package com.kulpreet.springBoot1.Dao;

import com.kulpreet.springBoot1.DTO.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    public List<Employee> findByDepartmentId(long id);
}
