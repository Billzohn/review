package cn.springmvc.model;

import java.util.Date;

public class Classthree {
    private Integer id;

    private String name;

    private Date startTime;

    private Date endTime;

    private String creatTime;

    private String creator;

    private String demoone;

    private String demotwo;

    private String demothree;

    private String demofour;

    private Integer classtwoId;

    private Integer reviewprogramId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime == null ? null : creatTime.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getDemoone() {
        return demoone;
    }

    public void setDemoone(String demoone) {
        this.demoone = demoone == null ? null : demoone.trim();
    }

    public String getDemotwo() {
        return demotwo;
    }

    public void setDemotwo(String demotwo) {
        this.demotwo = demotwo == null ? null : demotwo.trim();
    }

    public String getDemothree() {
        return demothree;
    }

    public void setDemothree(String demothree) {
        this.demothree = demothree == null ? null : demothree.trim();
    }

    public String getDemofour() {
        return demofour;
    }

    public void setDemofour(String demofour) {
        this.demofour = demofour == null ? null : demofour.trim();
    }

    public Integer getClasstwoId() {
        return classtwoId;
    }

    public void setClasstwoId(Integer classtwoId) {
        this.classtwoId = classtwoId;
    }

    public Integer getReviewprogramId() {
        return reviewprogramId;
    }

    public void setReviewprogramId(Integer reviewprogramId) {
        this.reviewprogramId = reviewprogramId;
    }
}