package cn.springmvc.model;

import java.util.Date;

public class Comment {
    private Integer id;

    private String content;

    private String classes;

    private String score;

    private String sort;

    private String pass;

    private Date commentTime;

    private String demoone;

    private String demotwo;

    private String demothree;

    private String demofour;

    private String demofive;

    private String demosix;

    private String demoseven;

    private String demoeight;

    private String demonine;

    private String demoten;

    private Integer projectId;

    private Integer expertId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
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

    public String getDemofive() {
        return demofive;
    }

    public void setDemofive(String demofive) {
        this.demofive = demofive == null ? null : demofive.trim();
    }

    public String getDemosix() {
        return demosix;
    }

    public void setDemosix(String demosix) {
        this.demosix = demosix == null ? null : demosix.trim();
    }

    public String getDemoseven() {
        return demoseven;
    }

    public void setDemoseven(String demoseven) {
        this.demoseven = demoseven == null ? null : demoseven.trim();
    }

    public String getDemoeight() {
        return demoeight;
    }

    public void setDemoeight(String demoeight) {
        this.demoeight = demoeight == null ? null : demoeight.trim();
    }

    public String getDemonine() {
        return demonine;
    }

    public void setDemonine(String demonine) {
        this.demonine = demonine == null ? null : demonine.trim();
    }

    public String getDemoten() {
        return demoten;
    }

    public void setDemoten(String demoten) {
        this.demoten = demoten == null ? null : demoten.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getExpertId() {
        return expertId;
    }

    public void setExpertId(Integer expertId) {
        this.expertId = expertId;
    }
}