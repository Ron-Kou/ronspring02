package org.ronspring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ronspring.model.Departments;
import org.springframework.web.bind.annotation.Mapping;
@Mapper

public interface DepartmentsMapper {
    int deleteByPrimaryKey(String deptNo);

    int insert(Departments record);

    int insertSelective(Departments record);

    Departments selectByPrimaryKey(String deptNo);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);
}