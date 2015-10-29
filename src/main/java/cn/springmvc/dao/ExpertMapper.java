package cn.springmvc.dao;

import cn.springmvc.model.Expert;

public interface ExpertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Expert record);

    int insertSelective(Expert record);

    Expert selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Expert record);

    int updateByPrimaryKey(Expert record);
}