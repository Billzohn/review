package cn.springmvc.model;

public class User {
    private Integer id;

    private String number;

    private String sex;

    private String name;

    private String pic;

    private Integer type;

    private String password;

    private String phone;

    private String email;

    private String birthday;

    private String demoone;

    private String demotwo;

    private String demothree;

    private String demofour;

    private Integer departmentId;

    private Integer titleId;

    private Integer eductionId;

    private Integer degreeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
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

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getEductionId() {
        return eductionId;
    }

    public void setEductionId(Integer eductionId) {
        this.eductionId = eductionId;
    }

    public Integer getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(Integer degreeId) {
        this.degreeId = degreeId;
    }
}