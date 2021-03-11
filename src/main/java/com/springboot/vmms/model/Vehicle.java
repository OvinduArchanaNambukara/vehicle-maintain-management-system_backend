package com.springboot.vmms.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
    private String vehiMake;
    private String vehiModel;
    private String chassisNo;
    private String engiNo;
    private String color;
    private String regDate;
    @Id
    private String regNo;
    private String odoRead;
    private String yrManu;
    private String fuelType;
    private String userId;

    public Vehicle() {
    }

    public Vehicle(String vehiMake, String vehiModel, String chassisNo, String engiNo, String color, String regDate,
                   String regNo, String odoRead, String yrManu, String fuelType, String userId) {
        this.vehiMake = vehiMake;
        this.vehiModel = vehiModel;
        this.chassisNo = chassisNo;
        this.engiNo = engiNo;
        this.color = color;
        this.regDate = regDate;
        this.regNo = regNo;
        this.odoRead = odoRead;
        this.yrManu = yrManu;
        this.fuelType = fuelType;
        this.userId = userId;
    }

    public String getVehiMake() {
        return vehiMake;
    }

    public void setVehiMake(String vehiMake) {
        this.vehiMake = vehiMake;
    }

    public String getVehiModel() {
        return vehiModel;
    }

    public void setVehiModel(String vehiModel) {
        this.vehiModel = vehiModel;
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getEngiNo() {
        return engiNo;
    }

    public void setEngiNo(String engiNo) {
        this.engiNo = engiNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getOdoRead() {
        return odoRead;
    }

    public void setOdoRead(String odoRead) {
        this.odoRead = odoRead;
    }

    public String getYrManu() {
        return yrManu;
    }

    public void setYrManu(String yrManu) {
        this.yrManu = yrManu;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
