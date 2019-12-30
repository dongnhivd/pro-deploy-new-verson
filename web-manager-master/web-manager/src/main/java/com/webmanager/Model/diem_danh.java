package com.webmanager.Model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.awt.*;
import java.util.Date;

@Entity
@Table(name = "diem_danh")


@ToString
public class diem_danh {

    @Id
    @GeneratedValue
    private int ID;
    private String ID_employ;
//    private Image img;
    private Long distance;
    private Date date;

    public diem_danh(){}

    public diem_danh(int ID, String ID_employ, Image img, Long distance, Date date){
        this.ID = ID;
        this.ID_employ = ID_employ;
//        this.img = img;
        this.distance = distance;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getID_employ() {
        return ID_employ;
    }

    public void setID_employ(String ID_employ) {
        this.ID_employ = ID_employ;
    }

//    public Image getImg() {
//        return img;
//    }
//
//    public void setImg(Image img) {
//        this.img = img;
//    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
