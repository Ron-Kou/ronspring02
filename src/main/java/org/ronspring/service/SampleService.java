package org.ronspring.service;

import org.ronspring.model.Employees;
import org.springframework.stereotype.Service;

/**
 * Created by Ron on 2018/6/4.
 */
public interface SampleService {
    Employees selectAEmployee();
}
