package cn.springmvc.dao;

import cn.springmvc.model.Classtwo;

public interface ClasstwoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classtwo record);

    int insertSelective(Classtwo record);

    Classtwo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classtwo record);

    int updateByPrimaryKey(Classtwo record);
}