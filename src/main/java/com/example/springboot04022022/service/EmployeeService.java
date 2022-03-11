package com.example.springboot04022022.service;

import com.example.springboot04022022.entity.Employee;
import com.example.springboot04022022.exception.CustomEmployeeException;
import com.example.springboot04022022.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new CustomEmployeeException("ID " + id + " nicht gefunden"));
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
