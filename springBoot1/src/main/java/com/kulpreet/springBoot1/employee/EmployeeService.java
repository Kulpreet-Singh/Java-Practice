package com.kulpreet.springBoot1.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployees(long departmentId){
        List<Employee> employees = new ArrayList<>();
        employeeRepository
                .findByDepartmentId(departmentId)
                .forEach(employees::add);
        return employees;
    }

    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).get();
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
