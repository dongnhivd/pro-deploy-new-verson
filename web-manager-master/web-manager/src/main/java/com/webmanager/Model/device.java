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

@Entity
@Table(name = "device")


@ToString
public class device {
    @Id
    @GeneratedValue
    private int id_device;
    private String device_name;
    private int status;
    private int command;
    private int check_alive;
    public device() {

    }

    public device(int id_device, String device_name, int status, int command, int check_alive) {
        this.id_device = id_device;
        this.device_name = device_name;
        this.status = status;
        this.command = command;
        this.check_alive = check_alive;
    }

    public int getCheck_alive() {
        return check_alive;
    }

    public void setCheck_alive(int check_alive) {
        this.check_alive = check_alive;
    }

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public int getId_device() {
        return id_device;
    }

    public void setId_device(int id_device) {
        this.id_device = id_device;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
