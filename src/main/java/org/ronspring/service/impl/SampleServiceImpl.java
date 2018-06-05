package org.ronspring.service.impl;

import org.ronspring.dao.EmployeesMapper;
import org.ronspring.model.Employees;
import org.ronspring.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ron on 2018/6/4.
 * spring boot扫描顺序从包的上到下
 */
@Service("sampleService")
public class SampleServiceImpl implements SampleService {
    @Autowired
    EmployeesMapper employeesMapper;
    @Override
    public Employees selectAEmployee() {
        return employeesMapper.selectByPrimaryKey(10001);
    }
}
