package cn.springmvc.dao;

import cn.springmvc.model.Reviewprogram;

public interface ReviewprogramMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reviewprogram record);

    int insertSelective(Reviewprogram record);

    Reviewprogram selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reviewprogram record);

    int updateByPrimaryKey(Reviewprogram record);
}