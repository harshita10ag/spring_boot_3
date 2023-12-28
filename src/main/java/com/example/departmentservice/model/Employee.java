package com.example.departmentservice.model;

import lombok.Data;


public record Employee(Long id,Long departmentId,String name, Integer age,String position) {


}
