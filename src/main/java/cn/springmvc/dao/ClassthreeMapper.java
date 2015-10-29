package cn.springmvc.dao;

import cn.springmvc.model.Classthree;

public interface ClassthreeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classthree record);

    int insertSelective(Classthree record);

    Classthree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classthree record);

    int updateByPrimaryKey(Classthree record);
}