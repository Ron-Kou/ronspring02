package org.ronspring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ronspring.model.Salaries;
import org.ronspring.model.SalariesKey;
@Mapper

public interface SalariesMapper {
    int deleteByPrimaryKey(SalariesKey key);

    int insert(Salaries record);

    int insertSelective(Salaries record);

    Salaries selectByPrimaryKey(SalariesKey key);

    int updateByPrimaryKeySelective(Salaries record);

    int updateByPrimaryKey(Salaries record);
}