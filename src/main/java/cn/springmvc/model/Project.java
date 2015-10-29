package cn.springmvc.model;

public class Project {
    private Integer id;

    private String name;

    private String file;

    private String demoone;

    private String demotwo;

    private String demothree;

    private String demofour;

    private String demofive;

    private String demosix;

    private String demoseven;

    private Integer classthreeId;

    private Integer userId;

    private Integer subjectcategoryId;

    private Integer disciplinecategoryId;

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

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
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

    public Integer getClassthreeId() {
        return classthreeId;
    }

    public void setClassthreeId(Integer classthreeId) {
        this.classthreeId = classthreeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSubjectcategoryId() {
        return subjectcategoryId;
    }

    public void setSubjectcategoryId(Integer subjectcategoryId) {
        this.subjectcategoryId = subjectcategoryId;
    }

    public Integer getDisciplinecategoryId() {
        return disciplinecategoryId;
    }

    public void setDisciplinecategoryId(Integer disciplinecategoryId) {
        this.disciplinecategoryId = disciplinecategoryId;
    }
}