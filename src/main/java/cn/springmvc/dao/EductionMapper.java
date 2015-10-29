package cn.springmvc.dao;

import cn.springmvc.model.Eduction;

public interface EductionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Eduction record);

    int insertSelective(Eduction record);

    Eduction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Eduction record);

    int updateByPrimaryKey(Eduction record);
}