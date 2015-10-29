package cn.springmvc.model;

public class Reviewprogram {
    private Integer id;

    private String name;

    private String classname;

    private String url;

    private String demoone;

    private String demotwo;

    private String demothree;

    private String demofour;

    private String demofive;

    private String demosix;

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

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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
}