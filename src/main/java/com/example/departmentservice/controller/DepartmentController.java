package com.example.departmentservice.controller;

import com.example.departmentservice.client.EmployeeClient;
import com.example.departmentservice.model.Department;
import com.example.departmentservice.model.Employee;
import com.example.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeClient employeeClient;

    @GetMapping("/all")
    public List<Department> getDepartment(){

       return departmentRepository.findByAll();

    }

    @GetMapping("/id/{id}")
    public Department getById(@PathVariable("id") Long id){

        return  departmentRepository.findById(id);
    }

    @PostMapping("/add")
    public Department addDepartmentDetail(@RequestBody Department department){

        return  departmentRepository.addDepartment(department);
    }

    @GetMapping("/data/{id}")
    public List<Department> getData(@PathVariable("id") Long id){

    List<Department> departments = departmentRepository.findByAll();
    departments.forEach(department -> department.setEmployeeList(employeeClient.getEmployeeByDepartmentId(department.getId())));

      return  departments;
    }


}
