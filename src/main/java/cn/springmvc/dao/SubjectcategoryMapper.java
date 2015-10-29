package cn.springmvc.dao;

import cn.springmvc.model.Subjectcategory;

public interface SubjectcategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Subjectcategory record);

    int insertSelective(Subjectcategory record);

    Subjectcategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subjectcategory record);

    int updateByPrimaryKey(Subjectcategory record);
}