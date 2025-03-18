package com.webinars.transportation_equipment.pojo;

import java.util.Date;

public class Sensor {
    private String _id;
    private String sensor_id;
    private String type;
    private String make;
    private String model;
    private Date installation_date;
    private String status;

    // Getters and Setters
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSensor_id() {
        return sensor_id;
    }

    public void setSensor_id(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getInstallation_date() {
        return installation_date;
    }

    public void setInstallation_date(Date installation_date) {
        this.installation_date = installation_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "_id='" + _id + '\'' +
                ", sensor_id='" + sensor_id + '\'' +
                ", type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", installation_date=" + installation_date +
                ", status='" + status + '\'' +
                '}';
    }
}
