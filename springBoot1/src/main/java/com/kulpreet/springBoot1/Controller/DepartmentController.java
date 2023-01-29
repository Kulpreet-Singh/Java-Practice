package com.kulpreet.springBoot1.Controller;

import com.kulpreet.springBoot1.DTO.Department;
import com.kulpreet.springBoot1.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @RequestMapping("/departments/{id}")
    public Department getDepartment(@PathVariable long id){
        return departmentService.getDepartment(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/departments")
    public void addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/departments/{id}")
    public void updateDepartment(@RequestBody Department department, @PathVariable long id){
        departmentService.updateDepartment(id, department);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/departments/{id}")
    public void deleteDepartment(@PathVariable long id){
        departmentService.deleteDepartment(id);
    }
}
