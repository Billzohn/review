package cn.springmvc.dao;

import cn.springmvc.model.Degree;

public interface DegreeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Degree record);

    int insertSelective(Degree record);

    Degree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Degree record);

    int updateByPrimaryKey(Degree record);
}