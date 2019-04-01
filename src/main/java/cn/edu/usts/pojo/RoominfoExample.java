package cn.edu.usts.pojo;

import java.util.ArrayList;
import java.util.List;

public class RoominfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoominfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNull() {
            addCriterion("room_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("room_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(String value) {
            addCriterion("room_name =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(String value) {
            addCriterion("room_name <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(String value) {
            addCriterion("room_name >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("room_name >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(String value) {
            addCriterion("room_name <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(String value) {
            addCriterion("room_name <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLike(String value) {
            addCriterion("room_name like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotLike(String value) {
            addCriterion("room_name not like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<String> values) {
            addCriterion("room_name in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<String> values) {
            addCriterion("room_name not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(String value1, String value2) {
            addCriterion("room_name between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(String value1, String value2) {
            addCriterion("room_name not between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIsNull() {
            addCriterion("room_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIsNotNull() {
            addCriterion("room_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdEqualTo(String value) {
            addCriterion("room_type_id =", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotEqualTo(String value) {
            addCriterion("room_type_id <>", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdGreaterThan(String value) {
            addCriterion("room_type_id >", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_type_id >=", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdLessThan(String value) {
            addCriterion("room_type_id <", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdLessThanOrEqualTo(String value) {
            addCriterion("room_type_id <=", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdLike(String value) {
            addCriterion("room_type_id like", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotLike(String value) {
            addCriterion("room_type_id not like", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIn(List<String> values) {
            addCriterion("room_type_id in", values, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotIn(List<String> values) {
            addCriterion("room_type_id not in", values, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdBetween(String value1, String value2) {
            addCriterion("room_type_id between", value1, value2, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotBetween(String value1, String value2) {
            addCriterion("room_type_id not between", value1, value2, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNull() {
            addCriterion("room_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNotNull() {
            addCriterion("room_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberEqualTo(String value) {
            addCriterion("room_number =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(String value) {
            addCriterion("room_number <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(String value) {
            addCriterion("room_number >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("room_number >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(String value) {
            addCriterion("room_number <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(String value) {
            addCriterion("room_number <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLike(String value) {
            addCriterion("room_number like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotLike(String value) {
            addCriterion("room_number not like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<String> values) {
            addCriterion("room_number in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<String> values) {
            addCriterion("room_number not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(String value1, String value2) {
            addCriterion("room_number between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(String value1, String value2) {
            addCriterion("room_number not between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andFloorIsNull() {
            addCriterion("floor is null");
            return (Criteria) this;
        }

        public Criteria andFloorIsNotNull() {
            addCriterion("floor is not null");
            return (Criteria) this;
        }

        public Criteria andFloorEqualTo(Integer value) {
            addCriterion("floor =", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotEqualTo(Integer value) {
            addCriterion("floor <>", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThan(Integer value) {
            addCriterion("floor >", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor >=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThan(Integer value) {
            addCriterion("floor <", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorLessThanOrEqualTo(Integer value) {
            addCriterion("floor <=", value, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorIn(List<Integer> values) {
            addCriterion("floor in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotIn(List<Integer> values) {
            addCriterion("floor not in", values, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorBetween(Integer value1, Integer value2) {
            addCriterion("floor between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("floor not between", value1, value2, "floor");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNull() {
            addCriterion("building_name is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIsNotNull() {
            addCriterion("building_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNameEqualTo(String value) {
            addCriterion("building_name =", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotEqualTo(String value) {
            addCriterion("building_name <>", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThan(String value) {
            addCriterion("building_name >", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameGreaterThanOrEqualTo(String value) {
            addCriterion("building_name >=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThan(String value) {
            addCriterion("building_name <", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLessThanOrEqualTo(String value) {
            addCriterion("building_name <=", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameLike(String value) {
            addCriterion("building_name like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotLike(String value) {
            addCriterion("building_name not like", value, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameIn(List<String> values) {
            addCriterion("building_name in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotIn(List<String> values) {
            addCriterion("building_name not in", values, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameBetween(String value1, String value2) {
            addCriterion("building_name between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andBuildingNameNotBetween(String value1, String value2) {
            addCriterion("building_name not between", value1, value2, "buildingName");
            return (Criteria) this;
        }

        public Criteria andUsageAreaIsNull() {
            addCriterion("usage_area is null");
            return (Criteria) this;
        }

        public Criteria andUsageAreaIsNotNull() {
            addCriterion("usage_area is not null");
            return (Criteria) this;
        }

        public Criteria andUsageAreaEqualTo(Long value) {
            addCriterion("usage_area =", value, "usageArea");
            return (Criteria) this;
        }

        public Criteria andUsageAreaNotEqualTo(Long value) {
            addCriterion("usage_area <>", value, "usageArea");
            return (Criteria) this;
        }

        public Criteria andUsageAreaGreaterThan(Long value) {
            addCriterion("usage_area >", value, "usageArea");
            return (Criteria) this;
        }

        public Criteria andUsageAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("usage_area >=", value, "usageArea");
            return (Criteria) this;
        }

        public Criteria andUsageAreaLessThan(Long value) {
            addCriterion("usage_area <", value, "usageArea");
            return (Criteria) this;
        }

        public Criteria andUsageAreaLessThanOrEqualTo(Long value) {
            addCriterion("usage_area <=", value, "usageArea");
            return (Criteria) this;
        }

        public Criteria andUsageAreaIn(List<Long> values) {
            addCriterion("usage_area in", values, "usageArea");
            return (Criteria) this;
        }

        public Criteria andUsageAreaNotIn(List<Long> values) {
            addCriterion("usage_area not in", values, "usageArea");
            return (Criteria) this;
        }

        public Criteria andUsageAreaBetween(Long value1, Long value2) {
            addCriterion("usage_area between", value1, value2, "usageArea");
            return (Criteria) this;
        }

        public Criteria andUsageAreaNotBetween(Long value1, Long value2) {
            addCriterion("usage_area not between", value1, value2, "usageArea");
            return (Criteria) this;
        }

        public Criteria andCampusIsNull() {
            addCriterion("campus is null");
            return (Criteria) this;
        }

        public Criteria andCampusIsNotNull() {
            addCriterion("campus is not null");
            return (Criteria) this;
        }

        public Criteria andCampusEqualTo(String value) {
            addCriterion("campus =", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusNotEqualTo(String value) {
            addCriterion("campus <>", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusGreaterThan(String value) {
            addCriterion("campus >", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusGreaterThanOrEqualTo(String value) {
            addCriterion("campus >=", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusLessThan(String value) {
            addCriterion("campus <", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusLessThanOrEqualTo(String value) {
            addCriterion("campus <=", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusLike(String value) {
            addCriterion("campus like", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusNotLike(String value) {
            addCriterion("campus not like", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusIn(List<String> values) {
            addCriterion("campus in", values, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusNotIn(List<String> values) {
            addCriterion("campus not in", values, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusBetween(String value1, String value2) {
            addCriterion("campus between", value1, value2, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusNotBetween(String value1, String value2) {
            addCriterion("campus not between", value1, value2, "campus");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdIsNull() {
            addCriterion("key_administrator_id is null");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdIsNotNull() {
            addCriterion("key_administrator_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdEqualTo(Integer value) {
            addCriterion("key_administrator_id =", value, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdNotEqualTo(Integer value) {
            addCriterion("key_administrator_id <>", value, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdGreaterThan(Integer value) {
            addCriterion("key_administrator_id >", value, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("key_administrator_id >=", value, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdLessThan(Integer value) {
            addCriterion("key_administrator_id <", value, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdLessThanOrEqualTo(Integer value) {
            addCriterion("key_administrator_id <=", value, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdIn(List<Integer> values) {
            addCriterion("key_administrator_id in", values, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdNotIn(List<Integer> values) {
            addCriterion("key_administrator_id not in", values, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdBetween(Integer value1, Integer value2) {
            addCriterion("key_administrator_id between", value1, value2, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andKeyAdministratorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("key_administrator_id not between", value1, value2, "keyAdministratorId");
            return (Criteria) this;
        }

        public Criteria andDoorCountIsNull() {
            addCriterion("door_count is null");
            return (Criteria) this;
        }

        public Criteria andDoorCountIsNotNull() {
            addCriterion("door_count is not null");
            return (Criteria) this;
        }

        public Criteria andDoorCountEqualTo(Integer value) {
            addCriterion("door_count =", value, "doorCount");
            return (Criteria) this;
        }

        public Criteria andDoorCountNotEqualTo(Integer value) {
            addCriterion("door_count <>", value, "doorCount");
            return (Criteria) this;
        }

        public Criteria andDoorCountGreaterThan(Integer value) {
            addCriterion("door_count >", value, "doorCount");
            return (Criteria) this;
        }

        public Criteria andDoorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("door_count >=", value, "doorCount");
            return (Criteria) this;
        }

        public Criteria andDoorCountLessThan(Integer value) {
            addCriterion("door_count <", value, "doorCount");
            return (Criteria) this;
        }

        public Criteria andDoorCountLessThanOrEqualTo(Integer value) {
            addCriterion("door_count <=", value, "doorCount");
            return (Criteria) this;
        }

        public Criteria andDoorCountIn(List<Integer> values) {
            addCriterion("door_count in", values, "doorCount");
            return (Criteria) this;
        }

        public Criteria andDoorCountNotIn(List<Integer> values) {
            addCriterion("door_count not in", values, "doorCount");
            return (Criteria) this;
        }

        public Criteria andDoorCountBetween(Integer value1, Integer value2) {
            addCriterion("door_count between", value1, value2, "doorCount");
            return (Criteria) this;
        }

        public Criteria andDoorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("door_count not between", value1, value2, "doorCount");
            return (Criteria) this;
        }

        public Criteria andAreaUnitIsNull() {
            addCriterion("area_unit is null");
            return (Criteria) this;
        }

        public Criteria andAreaUnitIsNotNull() {
            addCriterion("area_unit is not null");
            return (Criteria) this;
        }

        public Criteria andAreaUnitEqualTo(Integer value) {
            addCriterion("area_unit =", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitNotEqualTo(Integer value) {
            addCriterion("area_unit <>", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitGreaterThan(Integer value) {
            addCriterion("area_unit >", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_unit >=", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitLessThan(Integer value) {
            addCriterion("area_unit <", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitLessThanOrEqualTo(Integer value) {
            addCriterion("area_unit <=", value, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitIn(List<Integer> values) {
            addCriterion("area_unit in", values, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitNotIn(List<Integer> values) {
            addCriterion("area_unit not in", values, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitBetween(Integer value1, Integer value2) {
            addCriterion("area_unit between", value1, value2, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andAreaUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("area_unit not between", value1, value2, "areaUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitIsNull() {
            addCriterion("reserve_unit is null");
            return (Criteria) this;
        }

        public Criteria andReserveUnitIsNotNull() {
            addCriterion("reserve_unit is not null");
            return (Criteria) this;
        }

        public Criteria andReserveUnitEqualTo(Integer value) {
            addCriterion("reserve_unit =", value, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitNotEqualTo(Integer value) {
            addCriterion("reserve_unit <>", value, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitGreaterThan(Integer value) {
            addCriterion("reserve_unit >", value, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve_unit >=", value, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitLessThan(Integer value) {
            addCriterion("reserve_unit <", value, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitLessThanOrEqualTo(Integer value) {
            addCriterion("reserve_unit <=", value, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitIn(List<Integer> values) {
            addCriterion("reserve_unit in", values, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitNotIn(List<Integer> values) {
            addCriterion("reserve_unit not in", values, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitBetween(Integer value1, Integer value2) {
            addCriterion("reserve_unit between", value1, value2, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andReserveUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("reserve_unit not between", value1, value2, "reserveUnit");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountIsNull() {
            addCriterion("doorPlates_count is null");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountIsNotNull() {
            addCriterion("doorPlates_count is not null");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountEqualTo(Integer value) {
            addCriterion("doorPlates_count =", value, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountNotEqualTo(Integer value) {
            addCriterion("doorPlates_count <>", value, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountGreaterThan(Integer value) {
            addCriterion("doorPlates_count >", value, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("doorPlates_count >=", value, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountLessThan(Integer value) {
            addCriterion("doorPlates_count <", value, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountLessThanOrEqualTo(Integer value) {
            addCriterion("doorPlates_count <=", value, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountIn(List<Integer> values) {
            addCriterion("doorPlates_count in", values, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountNotIn(List<Integer> values) {
            addCriterion("doorPlates_count not in", values, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountBetween(Integer value1, Integer value2) {
            addCriterion("doorPlates_count between", value1, value2, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andDoorplatesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("doorPlates_count not between", value1, value2, "doorplatesCount");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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