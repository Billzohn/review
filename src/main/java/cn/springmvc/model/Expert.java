package cn.springmvc.model;

public class Expert {
    private Integer id;

    private String name;

    private String password;

    private String email;

    private String post;

    private String school;

    private String demoone;

    private String demothree;

    private String demofour;

    private Integer titleId;

    private Integer degreeId;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getDemoone() {
        return demoone;
    }

    public void setDemoone(String demoone) {
        this.demoone = demoone == null ? null : demoone.trim();
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

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }
}