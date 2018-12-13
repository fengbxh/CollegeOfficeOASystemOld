package cn.edu.usts.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Teacheroccupationalinfo {

    public Teacheroccupationalinfo(){}

    public Teacheroccupationalinfo(String teId, String socialSecurityId, String unit, String interiorDepartment, Date participationDate, Date continuousWorkingDate, String postCategory, String presentPosition, String presentPosition2, String jobLevel, String technicalPosition, Date presentTechnicalPositionDate, Date jobLevelDate, String presentPost, String leadingRank, String nonLeadingRank, Date presentJobDate, Date startDate, String technicalLevel, Date technicalLevelDate) {
        this.teId = teId;
        this.socialSecurityId = socialSecurityId;
        this.unit = unit;
        this.interiorDepartment = interiorDepartment;
        this.participationDate = participationDate;
        this.continuousWorkingDate = continuousWorkingDate;
        this.postCategory = postCategory;
        this.presentPosition = presentPosition;
        this.presentPosition2 = presentPosition2;
        this.jobLevel = jobLevel;
        this.technicalPosition = technicalPosition;
        this.presentTechnicalPositionDate = presentTechnicalPositionDate;
        this.jobLevelDate = jobLevelDate;
        this.presentPost = presentPost;
        this.leadingRank = leadingRank;
        this.nonLeadingRank = nonLeadingRank;
        this.presentJobDate = presentJobDate;
        this.startDate = startDate;
        this.technicalLevel = technicalLevel;
        this.technicalLevelDate = technicalLevelDate;
    }

    private String teId;

    private String socialSecurityId;

    private String unit;

    private String interiorDepartment;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date participationDate;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date continuousWorkingDate;

    private String postCategory;

    private String presentPosition;

    private String presentPosition2;

    private String jobLevel;

    private String technicalPosition;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date presentTechnicalPositionDate;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date jobLevelDate;

    private String presentPost;

    private String leadingRank;

    private String nonLeadingRank;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date presentJobDate;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date startDate;

    private String technicalLevel;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date technicalLevelDate;

    public String getTeId() {
        return teId;
    }

    public void setTeId(String teId) {
        this.teId = teId == null ? null : teId.trim();
    }

    public String getSocialSecurityId() {
        return socialSecurityId;
    }

    public void setSocialSecurityId(String socialSecurityId) {
        this.socialSecurityId = socialSecurityId == null ? null : socialSecurityId.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getInteriorDepartment() {
        return interiorDepartment;
    }

    public void setInteriorDepartment(String interiorDepartment) {
        this.interiorDepartment = interiorDepartment == null ? null : interiorDepartment.trim();
    }

    public Date getParticipationDate() {
        return participationDate;
    }

    public void setParticipationDate(Date participationDate) {
        this.participationDate = participationDate;
    }

    public Date getContinuousWorkingDate() {
        return continuousWorkingDate;
    }

    public void setContinuousWorkingDate(Date continuousWorkingDate) {
        this.continuousWorkingDate = continuousWorkingDate;
    }

    public String getPostCategory() {
        return postCategory;
    }

    public void setPostCategory(String postCategory) {
        this.postCategory = postCategory == null ? null : postCategory.trim();
    }

    public String getPresentPosition() {
        return presentPosition;
    }

    public void setPresentPosition(String presentPosition) {
        this.presentPosition = presentPosition == null ? null : presentPosition.trim();
    }

    public String getPresentPosition2() {
        return presentPosition2;
    }

    public void setPresentPosition2(String presentPosition2) {
        this.presentPosition2 = presentPosition2 == null ? null : presentPosition2.trim();
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
    }

    public String getTechnicalPosition() {
        return technicalPosition;
    }

    public void setTechnicalPosition(String technicalPosition) {
        this.technicalPosition = technicalPosition == null ? null : technicalPosition.trim();
    }

    public Date getPresentTechnicalPositionDate() {
        return presentTechnicalPositionDate;
    }

    public void setPresentTechnicalPositionDate(Date presentTechnicalPositionDate) {
        this.presentTechnicalPositionDate = presentTechnicalPositionDate;
    }

    public Date getJobLevelDate() {
        return jobLevelDate;
    }

    public void setJobLevelDate(Date jobLevelDate) {
        this.jobLevelDate = jobLevelDate;
    }

    public String getPresentPost() {
        return presentPost;
    }

    public void setPresentPost(String presentPost) {
        this.presentPost = presentPost == null ? null : presentPost.trim();
    }

    public String getLeadingRank() {
        return leadingRank;
    }

    public void setLeadingRank(String leadingRank) {
        this.leadingRank = leadingRank == null ? null : leadingRank.trim();
    }

    public String getNonLeadingRank() {
        return nonLeadingRank;
    }

    public void setNonLeadingRank(String nonLeadingRank) {
        this.nonLeadingRank = nonLeadingRank == null ? null : nonLeadingRank.trim();
    }

    public Date getPresentJobDate() {
        return presentJobDate;
    }

    public void setPresentJobDate(Date presentJobDate) {
        this.presentJobDate = presentJobDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTechnicalLevel() {
        return technicalLevel;
    }

    public void setTechnicalLevel(String technicalLevel) {
        this.technicalLevel = technicalLevel == null ? null : technicalLevel.trim();
    }

    public Date getTechnicalLevelDate() {
        return technicalLevelDate;
    }

    public void setTechnicalLevelDate(Date technicalLevelDate) {
        this.technicalLevelDate = technicalLevelDate;
    }

}