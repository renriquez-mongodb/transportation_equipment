package com.webinars.transportation_equipment.pojo;

import java.util.Date;

public class MaintenanceRecord {

    private String _id;
    private String equipment_id;
    private Date date;
    private String description;
    private String technician;
    private String status;
    private Date next_due_date;

    // Constructors
    public MaintenanceRecord() {
    }

    public MaintenanceRecord(String _id, String equipment_id, Date date, String description, String technician, String status, Date next_due_date) {
        this._id = _id;
        this.equipment_id = equipment_id;
        this.date = date;
        this.description = description;
        this.technician = technician;
        this.status = status;
        this.next_due_date = next_due_date;
    }

    // Getters and Setters
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getEquipment_id() {
        return equipment_id;
    }

    public void setEquipment_id(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getNext_due_date() {
        return next_due_date;
    }

    public void setNext_due_date(Date next_due_date) {
        this.next_due_date = next_due_date;
    }

    @Override
    public String toString() {
        return "MaintenanceRecord{" +
                "_id='" + _id + '\'' +
                ", equipment_id='" + equipment_id + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", technician='" + technician + '\'' +
                ", status='" + status + '\'' +
                ", next_due_date=" + next_due_date +
                '}';
    }
}
