package cn.edu.usts.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacheroccupationalinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacheroccupationalinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTeIdIsNull() {
            addCriterion("te_id is null");
            return (Criteria) this;
        }

        public Criteria andTeIdIsNotNull() {
            addCriterion("te_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeIdEqualTo(String value) {
            addCriterion("te_id =", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotEqualTo(String value) {
            addCriterion("te_id <>", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdGreaterThan(String value) {
            addCriterion("te_id >", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdGreaterThanOrEqualTo(String value) {
            addCriterion("te_id >=", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLessThan(String value) {
            addCriterion("te_id <", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLessThanOrEqualTo(String value) {
            addCriterion("te_id <=", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdLike(String value) {
            addCriterion("te_id like", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotLike(String value) {
            addCriterion("te_id not like", value, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdIn(List<String> values) {
            addCriterion("te_id in", values, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotIn(List<String> values) {
            addCriterion("te_id not in", values, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdBetween(String value1, String value2) {
            addCriterion("te_id between", value1, value2, "teId");
            return (Criteria) this;
        }

        public Criteria andTeIdNotBetween(String value1, String value2) {
            addCriterion("te_id not between", value1, value2, "teId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdIsNull() {
            addCriterion("social_security_id is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdIsNotNull() {
            addCriterion("social_security_id is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdEqualTo(String value) {
            addCriterion("social_security_id =", value, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdNotEqualTo(String value) {
            addCriterion("social_security_id <>", value, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdGreaterThan(String value) {
            addCriterion("social_security_id >", value, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdGreaterThanOrEqualTo(String value) {
            addCriterion("social_security_id >=", value, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdLessThan(String value) {
            addCriterion("social_security_id <", value, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdLessThanOrEqualTo(String value) {
            addCriterion("social_security_id <=", value, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdLike(String value) {
            addCriterion("social_security_id like", value, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdNotLike(String value) {
            addCriterion("social_security_id not like", value, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdIn(List<String> values) {
            addCriterion("social_security_id in", values, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdNotIn(List<String> values) {
            addCriterion("social_security_id not in", values, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdBetween(String value1, String value2) {
            addCriterion("social_security_id between", value1, value2, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityIdNotBetween(String value1, String value2) {
            addCriterion("social_security_id not between", value1, value2, "socialSecurityId");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentIsNull() {
            addCriterion("interior_department is null");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentIsNotNull() {
            addCriterion("interior_department is not null");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentEqualTo(String value) {
            addCriterion("interior_department =", value, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentNotEqualTo(String value) {
            addCriterion("interior_department <>", value, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentGreaterThan(String value) {
            addCriterion("interior_department >", value, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("interior_department >=", value, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentLessThan(String value) {
            addCriterion("interior_department <", value, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentLessThanOrEqualTo(String value) {
            addCriterion("interior_department <=", value, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentLike(String value) {
            addCriterion("interior_department like", value, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentNotLike(String value) {
            addCriterion("interior_department not like", value, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentIn(List<String> values) {
            addCriterion("interior_department in", values, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentNotIn(List<String> values) {
            addCriterion("interior_department not in", values, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentBetween(String value1, String value2) {
            addCriterion("interior_department between", value1, value2, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andInteriorDepartmentNotBetween(String value1, String value2) {
            addCriterion("interior_department not between", value1, value2, "interiorDepartment");
            return (Criteria) this;
        }

        public Criteria andParticipationDateIsNull() {
            addCriterion("participation_date is null");
            return (Criteria) this;
        }

        public Criteria andParticipationDateIsNotNull() {
            addCriterion("participation_date is not null");
            return (Criteria) this;
        }

        public Criteria andParticipationDateEqualTo(Date value) {
            addCriterion("participation_date =", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateNotEqualTo(Date value) {
            addCriterion("participation_date <>", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateGreaterThan(Date value) {
            addCriterion("participation_date >", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("participation_date >=", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateLessThan(Date value) {
            addCriterion("participation_date <", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateLessThanOrEqualTo(Date value) {
            addCriterion("participation_date <=", value, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateIn(List<Date> values) {
            addCriterion("participation_date in", values, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateNotIn(List<Date> values) {
            addCriterion("participation_date not in", values, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateBetween(Date value1, Date value2) {
            addCriterion("participation_date between", value1, value2, "participationDate");
            return (Criteria) this;
        }

        public Criteria andParticipationDateNotBetween(Date value1, Date value2) {
            addCriterion("participation_date not between", value1, value2, "participationDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateIsNull() {
            addCriterion("continuous_working_date is null");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateIsNotNull() {
            addCriterion("continuous_working_date is not null");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateEqualTo(Date value) {
            addCriterion("continuous_working_date =", value, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateNotEqualTo(Date value) {
            addCriterion("continuous_working_date <>", value, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateGreaterThan(Date value) {
            addCriterion("continuous_working_date >", value, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("continuous_working_date >=", value, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateLessThan(Date value) {
            addCriterion("continuous_working_date <", value, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateLessThanOrEqualTo(Date value) {
            addCriterion("continuous_working_date <=", value, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateIn(List<Date> values) {
            addCriterion("continuous_working_date in", values, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateNotIn(List<Date> values) {
            addCriterion("continuous_working_date not in", values, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateBetween(Date value1, Date value2) {
            addCriterion("continuous_working_date between", value1, value2, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andContinuousWorkingDateNotBetween(Date value1, Date value2) {
            addCriterion("continuous_working_date not between", value1, value2, "continuousWorkingDate");
            return (Criteria) this;
        }

        public Criteria andPostCategoryIsNull() {
            addCriterion("post_category is null");
            return (Criteria) this;
        }

        public Criteria andPostCategoryIsNotNull() {
            addCriterion("post_category is not null");
            return (Criteria) this;
        }

        public Criteria andPostCategoryEqualTo(String value) {
            addCriterion("post_category =", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryNotEqualTo(String value) {
            addCriterion("post_category <>", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryGreaterThan(String value) {
            addCriterion("post_category >", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("post_category >=", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryLessThan(String value) {
            addCriterion("post_category <", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryLessThanOrEqualTo(String value) {
            addCriterion("post_category <=", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryLike(String value) {
            addCriterion("post_category like", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryNotLike(String value) {
            addCriterion("post_category not like", value, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryIn(List<String> values) {
            addCriterion("post_category in", values, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryNotIn(List<String> values) {
            addCriterion("post_category not in", values, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryBetween(String value1, String value2) {
            addCriterion("post_category between", value1, value2, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPostCategoryNotBetween(String value1, String value2) {
            addCriterion("post_category not between", value1, value2, "postCategory");
            return (Criteria) this;
        }

        public Criteria andPresentPositionIsNull() {
            addCriterion("present_position is null");
            return (Criteria) this;
        }

        public Criteria andPresentPositionIsNotNull() {
            addCriterion("present_position is not null");
            return (Criteria) this;
        }

        public Criteria andPresentPositionEqualTo(String value) {
            addCriterion("present_position =", value, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionNotEqualTo(String value) {
            addCriterion("present_position <>", value, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionGreaterThan(String value) {
            addCriterion("present_position >", value, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionGreaterThanOrEqualTo(String value) {
            addCriterion("present_position >=", value, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionLessThan(String value) {
            addCriterion("present_position <", value, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionLessThanOrEqualTo(String value) {
            addCriterion("present_position <=", value, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionLike(String value) {
            addCriterion("present_position like", value, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionNotLike(String value) {
            addCriterion("present_position not like", value, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionIn(List<String> values) {
            addCriterion("present_position in", values, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionNotIn(List<String> values) {
            addCriterion("present_position not in", values, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionBetween(String value1, String value2) {
            addCriterion("present_position between", value1, value2, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPositionNotBetween(String value1, String value2) {
            addCriterion("present_position not between", value1, value2, "presentPosition");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2IsNull() {
            addCriterion("present_position2 is null");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2IsNotNull() {
            addCriterion("present_position2 is not null");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2EqualTo(String value) {
            addCriterion("present_position2 =", value, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2NotEqualTo(String value) {
            addCriterion("present_position2 <>", value, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2GreaterThan(String value) {
            addCriterion("present_position2 >", value, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2GreaterThanOrEqualTo(String value) {
            addCriterion("present_position2 >=", value, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2LessThan(String value) {
            addCriterion("present_position2 <", value, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2LessThanOrEqualTo(String value) {
            addCriterion("present_position2 <=", value, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2Like(String value) {
            addCriterion("present_position2 like", value, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2NotLike(String value) {
            addCriterion("present_position2 not like", value, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2In(List<String> values) {
            addCriterion("present_position2 in", values, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2NotIn(List<String> values) {
            addCriterion("present_position2 not in", values, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2Between(String value1, String value2) {
            addCriterion("present_position2 between", value1, value2, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andPresentPosition2NotBetween(String value1, String value2) {
            addCriterion("present_position2 not between", value1, value2, "presentPosition2");
            return (Criteria) this;
        }

        public Criteria andJobLevelIsNull() {
            addCriterion("job_level is null");
            return (Criteria) this;
        }

        public Criteria andJobLevelIsNotNull() {
            addCriterion("job_level is not null");
            return (Criteria) this;
        }

        public Criteria andJobLevelEqualTo(String value) {
            addCriterion("job_level =", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotEqualTo(String value) {
            addCriterion("job_level <>", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelGreaterThan(String value) {
            addCriterion("job_level >", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelGreaterThanOrEqualTo(String value) {
            addCriterion("job_level >=", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLessThan(String value) {
            addCriterion("job_level <", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLessThanOrEqualTo(String value) {
            addCriterion("job_level <=", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelLike(String value) {
            addCriterion("job_level like", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotLike(String value) {
            addCriterion("job_level not like", value, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelIn(List<String> values) {
            addCriterion("job_level in", values, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotIn(List<String> values) {
            addCriterion("job_level not in", values, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelBetween(String value1, String value2) {
            addCriterion("job_level between", value1, value2, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andJobLevelNotBetween(String value1, String value2) {
            addCriterion("job_level not between", value1, value2, "jobLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionIsNull() {
            addCriterion("technical_position is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionIsNotNull() {
            addCriterion("technical_position is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionEqualTo(String value) {
            addCriterion("technical_position =", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionNotEqualTo(String value) {
            addCriterion("technical_position <>", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionGreaterThan(String value) {
            addCriterion("technical_position >", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionGreaterThanOrEqualTo(String value) {
            addCriterion("technical_position >=", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionLessThan(String value) {
            addCriterion("technical_position <", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionLessThanOrEqualTo(String value) {
            addCriterion("technical_position <=", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionLike(String value) {
            addCriterion("technical_position like", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionNotLike(String value) {
            addCriterion("technical_position not like", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionIn(List<String> values) {
            addCriterion("technical_position in", values, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionNotIn(List<String> values) {
            addCriterion("technical_position not in", values, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionBetween(String value1, String value2) {
            addCriterion("technical_position between", value1, value2, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionNotBetween(String value1, String value2) {
            addCriterion("technical_position not between", value1, value2, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateIsNull() {
            addCriterion("present_technical_position_date is null");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateIsNotNull() {
            addCriterion("present_technical_position_date is not null");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateEqualTo(Date value) {
            addCriterion("present_technical_position_date =", value, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateNotEqualTo(Date value) {
            addCriterion("present_technical_position_date <>", value, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateGreaterThan(Date value) {
            addCriterion("present_technical_position_date >", value, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("present_technical_position_date >=", value, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateLessThan(Date value) {
            addCriterion("present_technical_position_date <", value, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateLessThanOrEqualTo(Date value) {
            addCriterion("present_technical_position_date <=", value, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateIn(List<Date> values) {
            addCriterion("present_technical_position_date in", values, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateNotIn(List<Date> values) {
            addCriterion("present_technical_position_date not in", values, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateBetween(Date value1, Date value2) {
            addCriterion("present_technical_position_date between", value1, value2, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andPresentTechnicalPositionDateNotBetween(Date value1, Date value2) {
            addCriterion("present_technical_position_date not between", value1, value2, "presentTechnicalPositionDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateIsNull() {
            addCriterion("job_level_date is null");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateIsNotNull() {
            addCriterion("job_level_date is not null");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateEqualTo(Date value) {
            addCriterion("job_level_date =", value, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateNotEqualTo(Date value) {
            addCriterion("job_level_date <>", value, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateGreaterThan(Date value) {
            addCriterion("job_level_date >", value, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("job_level_date >=", value, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateLessThan(Date value) {
            addCriterion("job_level_date <", value, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateLessThanOrEqualTo(Date value) {
            addCriterion("job_level_date <=", value, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateIn(List<Date> values) {
            addCriterion("job_level_date in", values, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateNotIn(List<Date> values) {
            addCriterion("job_level_date not in", values, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateBetween(Date value1, Date value2) {
            addCriterion("job_level_date between", value1, value2, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andJobLevelDateNotBetween(Date value1, Date value2) {
            addCriterion("job_level_date not between", value1, value2, "jobLevelDate");
            return (Criteria) this;
        }

        public Criteria andPresentPostIsNull() {
            addCriterion("present_post is null");
            return (Criteria) this;
        }

        public Criteria andPresentPostIsNotNull() {
            addCriterion("present_post is not null");
            return (Criteria) this;
        }

        public Criteria andPresentPostEqualTo(String value) {
            addCriterion("present_post =", value, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostNotEqualTo(String value) {
            addCriterion("present_post <>", value, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostGreaterThan(String value) {
            addCriterion("present_post >", value, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostGreaterThanOrEqualTo(String value) {
            addCriterion("present_post >=", value, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostLessThan(String value) {
            addCriterion("present_post <", value, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostLessThanOrEqualTo(String value) {
            addCriterion("present_post <=", value, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostLike(String value) {
            addCriterion("present_post like", value, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostNotLike(String value) {
            addCriterion("present_post not like", value, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostIn(List<String> values) {
            addCriterion("present_post in", values, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostNotIn(List<String> values) {
            addCriterion("present_post not in", values, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostBetween(String value1, String value2) {
            addCriterion("present_post between", value1, value2, "presentPost");
            return (Criteria) this;
        }

        public Criteria andPresentPostNotBetween(String value1, String value2) {
            addCriterion("present_post not between", value1, value2, "presentPost");
            return (Criteria) this;
        }

        public Criteria andLeadingRankIsNull() {
            addCriterion("leading_rank is null");
            return (Criteria) this;
        }

        public Criteria andLeadingRankIsNotNull() {
            addCriterion("leading_rank is not null");
            return (Criteria) this;
        }

        public Criteria andLeadingRankEqualTo(String value) {
            addCriterion("leading_rank =", value, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankNotEqualTo(String value) {
            addCriterion("leading_rank <>", value, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankGreaterThan(String value) {
            addCriterion("leading_rank >", value, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankGreaterThanOrEqualTo(String value) {
            addCriterion("leading_rank >=", value, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankLessThan(String value) {
            addCriterion("leading_rank <", value, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankLessThanOrEqualTo(String value) {
            addCriterion("leading_rank <=", value, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankLike(String value) {
            addCriterion("leading_rank like", value, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankNotLike(String value) {
            addCriterion("leading_rank not like", value, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankIn(List<String> values) {
            addCriterion("leading_rank in", values, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankNotIn(List<String> values) {
            addCriterion("leading_rank not in", values, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankBetween(String value1, String value2) {
            addCriterion("leading_rank between", value1, value2, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andLeadingRankNotBetween(String value1, String value2) {
            addCriterion("leading_rank not between", value1, value2, "leadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankIsNull() {
            addCriterion("non_leading_rank is null");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankIsNotNull() {
            addCriterion("non_leading_rank is not null");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankEqualTo(String value) {
            addCriterion("non_leading_rank =", value, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankNotEqualTo(String value) {
            addCriterion("non_leading_rank <>", value, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankGreaterThan(String value) {
            addCriterion("non_leading_rank >", value, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankGreaterThanOrEqualTo(String value) {
            addCriterion("non_leading_rank >=", value, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankLessThan(String value) {
            addCriterion("non_leading_rank <", value, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankLessThanOrEqualTo(String value) {
            addCriterion("non_leading_rank <=", value, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankLike(String value) {
            addCriterion("non_leading_rank like", value, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankNotLike(String value) {
            addCriterion("non_leading_rank not like", value, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankIn(List<String> values) {
            addCriterion("non_leading_rank in", values, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankNotIn(List<String> values) {
            addCriterion("non_leading_rank not in", values, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankBetween(String value1, String value2) {
            addCriterion("non_leading_rank between", value1, value2, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andNonLeadingRankNotBetween(String value1, String value2) {
            addCriterion("non_leading_rank not between", value1, value2, "nonLeadingRank");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateIsNull() {
            addCriterion("present_job_date is null");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateIsNotNull() {
            addCriterion("present_job_date is not null");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateEqualTo(Date value) {
            addCriterion("present_job_date =", value, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateNotEqualTo(Date value) {
            addCriterion("present_job_date <>", value, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateGreaterThan(Date value) {
            addCriterion("present_job_date >", value, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateGreaterThanOrEqualTo(Date value) {
            addCriterion("present_job_date >=", value, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateLessThan(Date value) {
            addCriterion("present_job_date <", value, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateLessThanOrEqualTo(Date value) {
            addCriterion("present_job_date <=", value, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateIn(List<Date> values) {
            addCriterion("present_job_date in", values, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateNotIn(List<Date> values) {
            addCriterion("present_job_date not in", values, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateBetween(Date value1, Date value2) {
            addCriterion("present_job_date between", value1, value2, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andPresentJobDateNotBetween(Date value1, Date value2) {
            addCriterion("present_job_date not between", value1, value2, "presentJobDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelIsNull() {
            addCriterion("technical_level is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelIsNotNull() {
            addCriterion("technical_level is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelEqualTo(String value) {
            addCriterion("technical_level =", value, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelNotEqualTo(String value) {
            addCriterion("technical_level <>", value, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelGreaterThan(String value) {
            addCriterion("technical_level >", value, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelGreaterThanOrEqualTo(String value) {
            addCriterion("technical_level >=", value, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelLessThan(String value) {
            addCriterion("technical_level <", value, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelLessThanOrEqualTo(String value) {
            addCriterion("technical_level <=", value, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelLike(String value) {
            addCriterion("technical_level like", value, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelNotLike(String value) {
            addCriterion("technical_level not like", value, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelIn(List<String> values) {
            addCriterion("technical_level in", values, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelNotIn(List<String> values) {
            addCriterion("technical_level not in", values, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelBetween(String value1, String value2) {
            addCriterion("technical_level between", value1, value2, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelNotBetween(String value1, String value2) {
            addCriterion("technical_level not between", value1, value2, "technicalLevel");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateIsNull() {
            addCriterion("technical_level_date is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateIsNotNull() {
            addCriterion("technical_level_date is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateEqualTo(Date value) {
            addCriterion("technical_level_date =", value, "technicalLevelDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateNotEqualTo(Date value) {
            addCriterion("technical_level_date <>", value, "technicalLevelDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateGreaterThan(Date value) {
            addCriterion("technical_level_date >", value, "technicalLevelDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("technical_level_date >=", value, "technicalLevelDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateLessThan(Date value) {
            addCriterion("technical_level_date <", value, "technicalLevelDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateLessThanOrEqualTo(Date value) {
            addCriterion("technical_level_date <=", value, "technicalLevelDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateIn(List<Date> values) {
            addCriterion("technical_level_date in", values, "technicalLevelDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateNotIn(List<Date> values) {
            addCriterion("technical_level_date not in", values, "technicalLevelDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateBetween(Date value1, Date value2) {
            addCriterion("technical_level_date between", value1, value2, "technicalLevelDate");
            return (Criteria) this;
        }

        public Criteria andTechnicalLevelDateNotBetween(Date value1, Date value2) {
            addCriterion("technical_level_date not between", value1, value2, "technicalLevelDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}