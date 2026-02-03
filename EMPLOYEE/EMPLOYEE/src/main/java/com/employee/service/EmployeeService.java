package com.employee.service;

import com.employee.model.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto saveEmployee(long id, EmployeeDto employeeDto);

    EmployeeDto updateEmployee(EmployeeDto employeeDto);

    void deleteEmployee(long id);

    EmployeeDto getSingleEmployee(long id);

    List<EmployeeDto> getAllEmployees();
}
