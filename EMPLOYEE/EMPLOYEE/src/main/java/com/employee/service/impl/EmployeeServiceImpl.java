package com.employee.service.impl;

import com.employee.model.dto.EmployeeDto;
import com.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public EmployeeDto saveEmployee(long id, EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public void deleteEmployee(long id) {

    }

    @Override
    public EmployeeDto getSingleEmployee(long id) {
        return null;
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return List.of();
    }
}
