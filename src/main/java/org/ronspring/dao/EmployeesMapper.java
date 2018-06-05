package org.ronspring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ronspring.model.Employees;
@Mapper
public interface EmployeesMapper {
    int deleteByPrimaryKey(Integer empNo);

    int insert(Employees record);

    int insertSelective(Employees record);

    Employees selectByPrimaryKey(Integer empNo);

    int updateByPrimaryKeySelective(Employees record);

    int updateByPrimaryKey(Employees record);
}