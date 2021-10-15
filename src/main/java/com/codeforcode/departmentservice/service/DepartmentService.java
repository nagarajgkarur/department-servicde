package com.codeforcode.departmentservice.service;

import com.codeforcode.departmentservice.entity.Department;
import com.codeforcode.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        log.debug("Inside save department of department service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long id){
        Optional<Department> optional = departmentRepository.findById(id);
        return optional.isPresent() ? optional.get() : null ;
    }

    public List<Department> getAll(){
        return  departmentRepository.findAll();
    }
}
