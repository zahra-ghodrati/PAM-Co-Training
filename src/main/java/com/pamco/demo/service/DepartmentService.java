package com.pamco.demo.service;

import com.pamco.demo.model.DepartmentModel;
import com.pamco.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public List<DepartmentModel>  findDepartment(){
        return departmentRepository.findAll();
    }
}
