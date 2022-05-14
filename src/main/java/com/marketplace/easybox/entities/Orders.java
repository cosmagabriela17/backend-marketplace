package com.marketplace.easybox.entities;

import javax.persistence.*;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private int orderValue;
    private String locationName;
    private int numberOfProducts;
    private double latitude;
    private double longitude;

    @ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinColumn(referencedColumnName = "client_id", name = "client_id")
    private Clients client;

    public Orders() {
    }

    public Orders(int orderId, int orderValue, String locationName, int numberOfProducts, double latitude, double longitude, Clients client) {
        this.orderId = orderId;
        this.orderValue = orderValue;
        this.locationName = locationName;
        this.numberOfProducts = numberOfProducts;
        this.latitude = latitude;
        this.longitude = longitude;
        this.client = client;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(int orderValue) {
        this.orderValue = orderValue;
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

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }
    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }
}
