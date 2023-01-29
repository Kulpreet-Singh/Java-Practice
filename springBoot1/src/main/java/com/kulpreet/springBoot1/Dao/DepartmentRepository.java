package com.kulpreet.springBoot1.Dao;

import com.kulpreet.springBoot1.DTO.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
