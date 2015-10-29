package cn.springmvc.dao;

import cn.springmvc.model.Assessmentresults;

public interface AssessmentresultsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Assessmentresults record);

    int insertSelective(Assessmentresults record);

    Assessmentresults selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Assessmentresults record);

    int updateByPrimaryKey(Assessmentresults record);
}