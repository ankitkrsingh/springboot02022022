package com.example.springboot04022022.repository;

import com.example.springboot04022022.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
