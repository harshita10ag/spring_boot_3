package com.example.departmentservice.client;

import com.example.departmentservice.model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "vehicle-information-api",url = "http://localhost:8082")
public interface EmployeeClient {

    @GetMapping("/employee/department/{id}")
    public List<Employee> getEmployeeByDepartmentId(@PathVariable("id") Long id);
}
