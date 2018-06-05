package org.ronspring.controller;

import org.ronspring.model.Employees;
import org.ronspring.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ron on 2018/6/4.
 */
@RestController
@RequestMapping("/")
public class SampleController {
    @Autowired
    SampleService sampleService;
    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }

    @RequestMapping("/sample/employee")
    public String selectAEmployee(){
        Employees employees = sampleService.selectAEmployee();
        String s = employees.getEmpNo()+": "+employees.getFirstName()+" "+employees.getLastName();
        return s;
    }


}
