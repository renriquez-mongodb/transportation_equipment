package com.webinars.transportation_equipment.pojo;

public class Location {
    private String _id;
    private String name;
    private String address;
    private Coordinates coordinates;
    private int capacity;

    // Inner class for Coordinates
    public static class Coordinates {
        private String type;
        private double[] coordinates;

        // Getters and Setters
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double[] getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(double[] coordinates) {
            this.coordinates = coordinates;
        }

        @Override
        public String toString() {
            return "Coordinates{" +
                    "type='" + type + '\'' +
                    ", coordinates=" + java.util.Arrays.toString(coordinates) +
                    '}';
        }
    }

    // Getters and Setters
    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Location{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", coordinates=" + coordinates +
                ", capacity=" + capacity +
                '}';
    }
}
