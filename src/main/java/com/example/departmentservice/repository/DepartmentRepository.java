package com.example.departmentservice.repository;

import com.example.departmentservice.model.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DepartmentRepository {

    private List<Department> departmentList = new ArrayList<>();

    public Department addDepartment(Department department){

        departmentList.add(department);
        return  department;
    }

    public  Department findById(Long id){

       return departmentList.stream().filter(department -> department.getId().equals(id)).findFirst().orElseThrow();
    }

    public List<Department> findByAll(){

        return  departmentList;
    }


}
