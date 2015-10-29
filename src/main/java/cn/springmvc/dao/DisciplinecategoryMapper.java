package cn.springmvc.dao;

import cn.springmvc.model.Disciplinecategory;

public interface DisciplinecategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Disciplinecategory record);

    int insertSelective(Disciplinecategory record);

    Disciplinecategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Disciplinecategory record);

    int updateByPrimaryKey(Disciplinecategory record);
}