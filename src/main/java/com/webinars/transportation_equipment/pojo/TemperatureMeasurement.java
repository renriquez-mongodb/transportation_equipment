package com.webinars.transportation_equipment.pojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TemperatureMeasurement {

    private String _id;
    private String equipment_id;
    private String timestamp;
    private double temperature;
    private String location;
    private String sensor_id;

    // Constructor
    public TemperatureMeasurement(String _id, String equipment_id, String timestamp, double temperature, String location, String sensor_id) {
        this._id = _id;
        this.equipment_id = equipment_id;
        this.timestamp = timestamp;
        this.temperature = temperature;
        this.location = location;
        this.sensor_id = sensor_id;
    }

    // Getters and Setters
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getEquipmentId() {
        return equipment_id;
    }

    public void setEquipmentId(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSensorId() {
        return sensor_id;
    }

    public void setSensorId(String sensor_id) {
        this.sensor_id = sensor_id;
    }

    // Optional: Method to format timestamp for display
    public String getFormattedTimestamp() {
        LocalDateTime dateTime = LocalDateTime.parse(timestamp, DateTimeFormatter.ISO_DATE_TIME);
        return dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    // Optional: toString method for easy debugging
    @Override
    public String toString() {
        return "TemperatureMeasurement{" +
                "_id='" + _id + '\'' +
                ", equipment_id='" + equipment_id + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", temperature=" + temperature +
                ", location='" + location + '\'' +
                ", sensor_id='" + sensor_id + '\'' +
                '}';
    }
}
