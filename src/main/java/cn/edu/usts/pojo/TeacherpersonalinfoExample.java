package cn.edu.usts.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeacherpersonalinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherpersonalinfoExample() {
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

        public Criteria andTeNameIsNull() {
            addCriterion("te_name is null");
            return (Criteria) this;
        }

        public Criteria andTeNameIsNotNull() {
            addCriterion("te_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeNameEqualTo(String value) {
            addCriterion("te_name =", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotEqualTo(String value) {
            addCriterion("te_name <>", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameGreaterThan(String value) {
            addCriterion("te_name >", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameGreaterThanOrEqualTo(String value) {
            addCriterion("te_name >=", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameLessThan(String value) {
            addCriterion("te_name <", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameLessThanOrEqualTo(String value) {
            addCriterion("te_name <=", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameLike(String value) {
            addCriterion("te_name like", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotLike(String value) {
            addCriterion("te_name not like", value, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameIn(List<String> values) {
            addCriterion("te_name in", values, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotIn(List<String> values) {
            addCriterion("te_name not in", values, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameBetween(String value1, String value2) {
            addCriterion("te_name between", value1, value2, "teName");
            return (Criteria) this;
        }

        public Criteria andTeNameNotBetween(String value1, String value2) {
            addCriterion("te_name not between", value1, value2, "teName");
            return (Criteria) this;
        }

        public Criteria andTeAgeIsNull() {
            addCriterion("te_age is null");
            return (Criteria) this;
        }

        public Criteria andTeAgeIsNotNull() {
            addCriterion("te_age is not null");
            return (Criteria) this;
        }

        public Criteria andTeAgeEqualTo(Integer value) {
            addCriterion("te_age =", value, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeAgeNotEqualTo(Integer value) {
            addCriterion("te_age <>", value, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeAgeGreaterThan(Integer value) {
            addCriterion("te_age >", value, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("te_age >=", value, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeAgeLessThan(Integer value) {
            addCriterion("te_age <", value, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeAgeLessThanOrEqualTo(Integer value) {
            addCriterion("te_age <=", value, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeAgeIn(List<Integer> values) {
            addCriterion("te_age in", values, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeAgeNotIn(List<Integer> values) {
            addCriterion("te_age not in", values, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeAgeBetween(Integer value1, Integer value2) {
            addCriterion("te_age between", value1, value2, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("te_age not between", value1, value2, "teAge");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayIsNull() {
            addCriterion("te_birthday is null");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayIsNotNull() {
            addCriterion("te_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayEqualTo(Date value) {
            addCriterion("te_birthday =", value, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayNotEqualTo(Date value) {
            addCriterion("te_birthday <>", value, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayGreaterThan(Date value) {
            addCriterion("te_birthday >", value, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("te_birthday >=", value, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayLessThan(Date value) {
            addCriterion("te_birthday <", value, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("te_birthday <=", value, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayIn(List<Date> values) {
            addCriterion("te_birthday in", values, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayNotIn(List<Date> values) {
            addCriterion("te_birthday not in", values, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayBetween(Date value1, Date value2) {
            addCriterion("te_birthday between", value1, value2, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andTeBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("te_birthday not between", value1, value2, "teBirthday");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNull() {
            addCriterion("graduate_school is null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIsNotNull() {
            addCriterion("graduate_school is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolEqualTo(String value) {
            addCriterion("graduate_school =", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotEqualTo(String value) {
            addCriterion("graduate_school <>", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThan(String value) {
            addCriterion("graduate_school >", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduate_school >=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThan(String value) {
            addCriterion("graduate_school <", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduate_school <=", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolLike(String value) {
            addCriterion("graduate_school like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotLike(String value) {
            addCriterion("graduate_school not like", value, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolIn(List<String> values) {
            addCriterion("graduate_school in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotIn(List<String> values) {
            addCriterion("graduate_school not in", values, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolBetween(String value1, String value2) {
            addCriterion("graduate_school between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andGraduateSchoolNotBetween(String value1, String value2) {
            addCriterion("graduate_school not between", value1, value2, "graduateSchool");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andTeEmailIsNull() {
            addCriterion("te_email is null");
            return (Criteria) this;
        }

        public Criteria andTeEmailIsNotNull() {
            addCriterion("te_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeEmailEqualTo(String value) {
            addCriterion("te_email =", value, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailNotEqualTo(String value) {
            addCriterion("te_email <>", value, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailGreaterThan(String value) {
            addCriterion("te_email >", value, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("te_email >=", value, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailLessThan(String value) {
            addCriterion("te_email <", value, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailLessThanOrEqualTo(String value) {
            addCriterion("te_email <=", value, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailLike(String value) {
            addCriterion("te_email like", value, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailNotLike(String value) {
            addCriterion("te_email not like", value, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailIn(List<String> values) {
            addCriterion("te_email in", values, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailNotIn(List<String> values) {
            addCriterion("te_email not in", values, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailBetween(String value1, String value2) {
            addCriterion("te_email between", value1, value2, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTeEmailNotBetween(String value1, String value2) {
            addCriterion("te_email not between", value1, value2, "teEmail");
            return (Criteria) this;
        }

        public Criteria andTePhoneIsNull() {
            addCriterion("te_phone is null");
            return (Criteria) this;
        }

        public Criteria andTePhoneIsNotNull() {
            addCriterion("te_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTePhoneEqualTo(String value) {
            addCriterion("te_phone =", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneNotEqualTo(String value) {
            addCriterion("te_phone <>", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneGreaterThan(String value) {
            addCriterion("te_phone >", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("te_phone >=", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneLessThan(String value) {
            addCriterion("te_phone <", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneLessThanOrEqualTo(String value) {
            addCriterion("te_phone <=", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneLike(String value) {
            addCriterion("te_phone like", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneNotLike(String value) {
            addCriterion("te_phone not like", value, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneIn(List<String> values) {
            addCriterion("te_phone in", values, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneNotIn(List<String> values) {
            addCriterion("te_phone not in", values, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneBetween(String value1, String value2) {
            addCriterion("te_phone between", value1, value2, "tePhone");
            return (Criteria) this;
        }

        public Criteria andTePhoneNotBetween(String value1, String value2) {
            addCriterion("te_phone not between", value1, value2, "tePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNull() {
            addCriterion("office_phone is null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNotNull() {
            addCriterion("office_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneEqualTo(String value) {
            addCriterion("office_phone =", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotEqualTo(String value) {
            addCriterion("office_phone <>", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThan(String value) {
            addCriterion("office_phone >", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("office_phone >=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThan(String value) {
            addCriterion("office_phone <", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThanOrEqualTo(String value) {
            addCriterion("office_phone <=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLike(String value) {
            addCriterion("office_phone like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotLike(String value) {
            addCriterion("office_phone not like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIn(List<String> values) {
            addCriterion("office_phone in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotIn(List<String> values) {
            addCriterion("office_phone not in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneBetween(String value1, String value2) {
            addCriterion("office_phone between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotBetween(String value1, String value2) {
            addCriterion("office_phone not between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIsNull() {
            addCriterion("postal_address is null");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIsNotNull() {
            addCriterion("postal_address is not null");
            return (Criteria) this;
        }

        public Criteria andPostalAddressEqualTo(String value) {
            addCriterion("postal_address =", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotEqualTo(String value) {
            addCriterion("postal_address <>", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressGreaterThan(String value) {
            addCriterion("postal_address >", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressGreaterThanOrEqualTo(String value) {
            addCriterion("postal_address >=", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLessThan(String value) {
            addCriterion("postal_address <", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLessThanOrEqualTo(String value) {
            addCriterion("postal_address <=", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLike(String value) {
            addCriterion("postal_address like", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotLike(String value) {
            addCriterion("postal_address not like", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIn(List<String> values) {
            addCriterion("postal_address in", values, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotIn(List<String> values) {
            addCriterion("postal_address not in", values, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressBetween(String value1, String value2) {
            addCriterion("postal_address between", value1, value2, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotBetween(String value1, String value2) {
            addCriterion("postal_address not between", value1, value2, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andOtherContactIsNull() {
            addCriterion("other_contact is null");
            return (Criteria) this;
        }

        public Criteria andOtherContactIsNotNull() {
            addCriterion("other_contact is not null");
            return (Criteria) this;
        }

        public Criteria andOtherContactEqualTo(String value) {
            addCriterion("other_contact =", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactNotEqualTo(String value) {
            addCriterion("other_contact <>", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactGreaterThan(String value) {
            addCriterion("other_contact >", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactGreaterThanOrEqualTo(String value) {
            addCriterion("other_contact >=", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactLessThan(String value) {
            addCriterion("other_contact <", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactLessThanOrEqualTo(String value) {
            addCriterion("other_contact <=", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactLike(String value) {
            addCriterion("other_contact like", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactNotLike(String value) {
            addCriterion("other_contact not like", value, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactIn(List<String> values) {
            addCriterion("other_contact in", values, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactNotIn(List<String> values) {
            addCriterion("other_contact not in", values, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactBetween(String value1, String value2) {
            addCriterion("other_contact between", value1, value2, "otherContact");
            return (Criteria) this;
        }

        public Criteria andOtherContactNotBetween(String value1, String value2) {
            addCriterion("other_contact not between", value1, value2, "otherContact");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectIsNull() {
            addCriterion("senior_talent_project is null");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectIsNotNull() {
            addCriterion("senior_talent_project is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectEqualTo(String value) {
            addCriterion("senior_talent_project =", value, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectNotEqualTo(String value) {
            addCriterion("senior_talent_project <>", value, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectGreaterThan(String value) {
            addCriterion("senior_talent_project >", value, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectGreaterThanOrEqualTo(String value) {
            addCriterion("senior_talent_project >=", value, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectLessThan(String value) {
            addCriterion("senior_talent_project <", value, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectLessThanOrEqualTo(String value) {
            addCriterion("senior_talent_project <=", value, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectLike(String value) {
            addCriterion("senior_talent_project like", value, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectNotLike(String value) {
            addCriterion("senior_talent_project not like", value, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectIn(List<String> values) {
            addCriterion("senior_talent_project in", values, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectNotIn(List<String> values) {
            addCriterion("senior_talent_project not in", values, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectBetween(String value1, String value2) {
            addCriterion("senior_talent_project between", value1, value2, "seniorTalentProject");
            return (Criteria) this;
        }

        public Criteria andSeniorTalentProjectNotBetween(String value1, String value2) {
            addCriterion("senior_talent_project not between", value1, value2, "seniorTalentProject");
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