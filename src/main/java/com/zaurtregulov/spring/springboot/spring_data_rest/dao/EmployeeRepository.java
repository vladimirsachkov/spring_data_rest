package com.zaurtregulov.spring.springboot.spring_data_rest.dao;

import com.zaurtregulov.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
