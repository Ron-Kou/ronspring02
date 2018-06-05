package org.ronspring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ronspring.model.DeptManager;
import org.ronspring.model.DeptManagerKey;
import org.springframework.web.bind.annotation.Mapping;
@Mapper

public interface DeptManagerMapper {
    int deleteByPrimaryKey(DeptManagerKey key);

    int insert(DeptManager record);

    int insertSelective(DeptManager record);

    DeptManager selectByPrimaryKey(DeptManagerKey key);

    int updateByPrimaryKeySelective(DeptManager record);

    int updateByPrimaryKey(DeptManager record);
}