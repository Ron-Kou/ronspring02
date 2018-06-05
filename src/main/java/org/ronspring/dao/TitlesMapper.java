package org.ronspring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.ronspring.model.Titles;
import org.ronspring.model.TitlesKey;
@Mapper

public interface TitlesMapper {
    int deleteByPrimaryKey(TitlesKey key);

    int insert(Titles record);

    int insertSelective(Titles record);

    Titles selectByPrimaryKey(TitlesKey key);

    int updateByPrimaryKeySelective(Titles record);

    int updateByPrimaryKey(Titles record);
}