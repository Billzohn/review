package cn.springmvc.dao;

import cn.springmvc.model.Classone;

public interface ClassoneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classone record);

    int insertSelective(Classone record);

    Classone selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classone record);

    int updateByPrimaryKey(Classone record);
}