package cn.edu.usts.pojo;

public class Roominfo {
    private Integer id;

    private String roomName;

    private String roomTypeId;

    private Integer status;

    private String roomNumber;

    private Integer floor;

    private String buildingName;

    private Long usageArea;

    private String campus;

    private String college;

    private Integer keyAdministratorId;

    private Integer doorCount;

    private Integer areaUnit;

    private Integer reserveUnit;

    private Integer doorplatesCount;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName == null ? null : roomName.trim();
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId == null ? null : roomTypeId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public Long getUsageArea() {
        return usageArea;
    }

    public void setUsageArea(Long usageArea) {
        this.usageArea = usageArea;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus == null ? null : campus.trim();
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    public Integer getKeyAdministratorId() {
        return keyAdministratorId;
    }

    public void setKeyAdministratorId(Integer keyAdministratorId) {
        this.keyAdministratorId = keyAdministratorId;
    }

    public Integer getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(Integer doorCount) {
        this.doorCount = doorCount;
    }

    public Integer getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(Integer areaUnit) {
        this.areaUnit = areaUnit;
    }

    public Integer getReserveUnit() {
        return reserveUnit;
    }

    public void setReserveUnit(Integer reserveUnit) {
        this.reserveUnit = reserveUnit;
    }

    public Integer getDoorplatesCount() {
        return doorplatesCount;
    }

    public void setDoorplatesCount(Integer doorplatesCount) {
        this.doorplatesCount = doorplatesCount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}