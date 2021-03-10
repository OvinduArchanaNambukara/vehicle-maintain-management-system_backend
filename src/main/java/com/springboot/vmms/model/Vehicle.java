package com.springboot.vmms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
    private String vehi_make;
    private String vehi_model;
    private String chassis_no;
    private String engi_no;
    private String color;
    private String reg_date;
    private String reg_no;
    private String odo_read;
    private String yr_manu;
    private String fuel_type;
    @Id
    private String user_id;

    public Vehicle() {
    }

    public Vehicle(String vehi_make, String odo_read, String vehi_model, String chassis_no, String engi_no, String color,
                   String reg_date, String reg_no, String yr_manu, String fuel_type, String user_id) {
        this.vehi_make = vehi_make;
        this.vehi_model = vehi_model;
        this.chassis_no = chassis_no;
        this.engi_no = engi_no;
        this.color = color;
        this.reg_date = reg_date;
        this.reg_no = reg_no;
        this.yr_manu = yr_manu;
        this.fuel_type = fuel_type;
        this.user_id = user_id;
        this.odo_read = odo_read;
    }

    public String getVehi_make() {
        return vehi_make;
    }

    public String getOdo_read() {
        return odo_read;
    }

    public void setOdo_read(String odo_read) {
        this.odo_read = odo_read;
    }

    public void setVehi_make(String vehi_make) {
        this.vehi_make = vehi_make;
    }

    public String getVehi_model() {
        return vehi_model;
    }

    public void setVehi_model(String vehi_model) {
        this.vehi_model = vehi_model;
    }

    public String getChassis_no() {
        return chassis_no;
    }

    public void setChassis_no(String chassis_no) {
        this.chassis_no = chassis_no;
    }

    public String getEngi_no() {
        return engi_no;
    }

    public void setEngi_no(String engi_no) {
        this.engi_no = engi_no;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getYr_manu() {
        return yr_manu;
    }

    public void setYr_manu(String yr_manu) {
        this.yr_manu = yr_manu;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
