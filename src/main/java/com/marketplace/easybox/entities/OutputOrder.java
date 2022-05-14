package com.marketplace.easybox.entities;


import org.springframework.stereotype.Component;

public class OutputOrder {

    int orderId;
    int value;
    int numberOfProducts;
    String locationName;
    double latitude;
    double longitude;

    public OutputOrder(int orderId, int value, int numberOfProducts, String locationName, double latitude, double longitude) {
        this.orderId = orderId;
        this.value = value;
        this.numberOfProducts = numberOfProducts;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
