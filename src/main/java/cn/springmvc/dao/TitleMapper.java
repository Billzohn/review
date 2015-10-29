package cn.springmvc.dao;

import cn.springmvc.model.Title;

public interface TitleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Title record);

    int insertSelective(Title record);

    Title selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Title record);

    int updateByPrimaryKey(Title record);
}