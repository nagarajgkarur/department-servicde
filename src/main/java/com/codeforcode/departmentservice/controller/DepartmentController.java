package com.codeforcode.departmentservice.controller;

import com.codeforcode.departmentservice.entity.Department;
import com.codeforcode.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.debug("inside save department of department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable  Long id){
        log.debug("Inside the find department by id of department controller");
        return departmentService.findDepartmentById(id);
    }
    @GetMapping("/")
    public List<Department> getAll(){
        log.debug("Inside the get all method of controller");
        return departmentService.getAll();
    }
}
