package com.pamco.demo.controller;

import com.pamco.demo.model.DepartmentModel;
import com.pamco.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/deps")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<DepartmentModel> findAllDep(){
       return departmentService.findDepartment();
    }
}
