package org.ronspring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ronspring.model.DeptEmp;
import org.ronspring.model.DeptEmpKey;
import org.springframework.web.bind.annotation.Mapping;
@Mapper

public interface DeptEmpMapper {
    int deleteByPrimaryKey(DeptEmpKey key);

    int insert(DeptEmp record);

    int insertSelective(DeptEmp record);

    DeptEmp selectByPrimaryKey(DeptEmpKey key);

    int updateByPrimaryKeySelective(DeptEmp record);

    int updateByPrimaryKey(DeptEmp record);
}