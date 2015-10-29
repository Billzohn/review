package cn.springmvc.dao;

import cn.springmvc.model.Webswitch;

public interface WebswitchMapper {
    int deleteByPrimaryKey(Integer type);

    int insert(Webswitch record);

    int insertSelective(Webswitch record);
}