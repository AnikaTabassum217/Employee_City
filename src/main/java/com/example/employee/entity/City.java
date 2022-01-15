package com.example.employee.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String name;
    private String postalCode;
    private String internationalName;

//    @OneToMany(cascade=CascadeType.ALL)
//    private Set<Employee> employees;
//
//    public Set<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(Set<Employee> employees) {
//        this.employees = employees;
//    }

    //    @OneToMany(mappedBy="employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<Employee> employee;
//
//    public List<Employee> getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(List<Employee> employee) {
//        this.employee = employee;
//    }

    public String getInternationalName() {
        return internationalName;
    }

    public void setInternationalName(String internationalName) {
        this.internationalName = internationalName;
    }



    //    @OneToMany(mappedBy = "employee", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
//            CascadeType.REFRESH })
//    private List<Employee> employeeList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

//    public List<Employee> getEmployeeList() {
//        return employeeList;
//    }
//
//    public void setEmployeeList(List<Employee> employeeList) {
//        this.employeeList = employeeList;
//    }
}
