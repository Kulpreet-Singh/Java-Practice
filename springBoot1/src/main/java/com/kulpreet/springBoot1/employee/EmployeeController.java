package com.kulpreet.springBoot1.employee;

import com.kulpreet.springBoot1.department.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/departments/{id}/employees")
    public List<Employee> getAllEmployees(@PathVariable long id){
        return employeeService.getAllEmployees(id);
    }

    @RequestMapping("/departments/{departmentId}/employees/{id}")
    public Employee getEmployee(@PathVariable long id){
        return employeeService.getEmployee(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/departments/{departmentId}/employees")
    public void addEmployee(@RequestBody Employee employee, @PathVariable long departmentId){
        employee.setDepartment(new Department(departmentId, "", "", 0));
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/departments/{departmentId}/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable long departmentId, @PathVariable long id){
        employee.setDepartment(new Department(departmentId, "", "", 0));
        employeeService.updateEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/departments/{departmentId}/employees/{id}")
    public void deleteEmployee(@PathVariable long id){
        employeeService.deleteEmployee(id);
    }
}
