package cn.springmvc.dao;

import cn.springmvc.model.Rules;

public interface RulesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rules record);

    int insertSelective(Rules record);

    Rules selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rules record);

    int updateByPrimaryKey(Rules record);
}