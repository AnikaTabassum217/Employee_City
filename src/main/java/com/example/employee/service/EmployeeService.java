package com.example.employee.service;

import com.example.employee.entity.City;
import com.example.employee.entity.Employee;
import com.example.employee.repository.CityRepository;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    CityRepository cityRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public void saveEmployee(long cityId) {
        Optional<City> cityOptional= cityRepository.findById(cityId);
        if(cityOptional.isPresent()) {
            Employee emp = new Employee();
            emp.setAge(25);
            emp.setName("name");
            emp.setCity(cityOptional.get());
            employeeRepository.save(emp);

        }
    }

    public Employee findEmpById(long id) {
        Employee employee = employeeRepository.findById(id).get();
        employee.getCity().getName();
        return employee;
    }
}
