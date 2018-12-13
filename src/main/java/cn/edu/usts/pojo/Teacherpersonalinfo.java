package cn.edu.usts.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Teacherpersonalinfo {

    public Teacherpersonalinfo(){}

    public Teacherpersonalinfo(String teId, String teName, Integer teAge, Date teBirthday, String education, String graduateSchool, String speciality, String teEmail, String tePhone, String officePhone, String postalAddress, String otherContact, String seniorTalentProject, Teacheroccupationalinfo teacheroccupationalinfo) {
        this.teId = teId;
        this.teName = teName;
        this.teAge = teAge;
        this.teBirthday = teBirthday;
        this.education = education;
        this.graduateSchool = graduateSchool;
        this.speciality = speciality;
        this.teEmail = teEmail;
        this.tePhone = tePhone;
        this.officePhone = officePhone;
        this.postalAddress = postalAddress;
        this.otherContact = otherContact;
        this.seniorTalentProject = seniorTalentProject;
        this.teacheroccupationalinfo = teacheroccupationalinfo;
    }
    public Teacherpersonalinfo(String teId, String teName, Integer teAge, Date teBirthday, String education, String graduateSchool, String speciality, String teEmail, String tePhone, String officePhone, String postalAddress, String otherContact, String seniorTalentProject) {
        this.teId = teId;
        this.teName = teName;
        this.teAge = teAge;
        this.teBirthday = teBirthday;
        this.education = education;
        this.graduateSchool = graduateSchool;
        this.speciality = speciality;
        this.teEmail = teEmail;
        this.tePhone = tePhone;
        this.officePhone = officePhone;
        this.postalAddress = postalAddress;
        this.otherContact = otherContact;
        this.seniorTalentProject = seniorTalentProject;
    }
    private String teId;

    private String teName;

    private Integer teAge;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date teBirthday;

    private String education;

    private String graduateSchool;

    private String speciality;

    private String teEmail;

    private String tePhone;

    private String officePhone;

    private String postalAddress;

    private String otherContact;

    private String seniorTalentProject;

    private Teacheroccupationalinfo teacheroccupationalinfo;

    public String getTeId() {
        return teId;
    }

    public void setTeId(String teId) {
        this.teId = teId == null ? null : teId.trim();
    }

    public String getTeName() {
        return teName;
    }

    public void setTeName(String teName) {
        this.teName = teName == null ? null : teName.trim();
    }

    public Integer getTeAge() {
        return teAge;
    }

    public void setTeAge(Integer teAge) {
        this.teAge = teAge;
    }

    public Date getTeBirthday() {
        return teBirthday;
    }

    public void setTeBirthday(Date teBirthday) {
        this.teBirthday = teBirthday;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool == null ? null : graduateSchool.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getTeEmail() {
        return teEmail;
    }

    public void setTeEmail(String teEmail) {
        this.teEmail = teEmail == null ? null : teEmail.trim();
    }

    public String getTePhone() {
        return tePhone;
    }

    public void setTePhone(String tePhone) {
        this.tePhone = tePhone == null ? null : tePhone.trim();
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone == null ? null : officePhone.trim();
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress == null ? null : postalAddress.trim();
    }

    public String getOtherContact() {
        return otherContact;
    }

    public void setOtherContact(String otherContact) {
        this.otherContact = otherContact == null ? null : otherContact.trim();
    }

    public String getSeniorTalentProject() {
        return seniorTalentProject;
    }

    public void setSeniorTalentProject(String seniorTalentProject) {
        this.seniorTalentProject = seniorTalentProject == null ? null : seniorTalentProject.trim();
    }

    public Teacheroccupationalinfo getTeacheroccupationalinfo() {
        return teacheroccupationalinfo;
    }

    public void setTeacheroccupationalinfo(Teacheroccupationalinfo teacheroccupationalinfo) {
        this.teacheroccupationalinfo = teacheroccupationalinfo;
    }
}