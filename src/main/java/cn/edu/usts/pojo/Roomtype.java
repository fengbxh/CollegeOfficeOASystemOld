package cn.edu.usts.pojo;

public class Roomtype {
    private Integer id;

    private String roomClassification;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomClassification() {
        return roomClassification;
    }

    public void setRoomClassification(String roomClassification) {
        this.roomClassification = roomClassification == null ? null : roomClassification.trim();
    }
}