package com.bignerdranch.android.models;

import java.util.UUID;

/**
 * Created by jsunthon on 5/10/2016.
 */
public class Restaurant {

    private UUID mId;
    private String name;
    private String address;
    private String phone;
    private int rating;
    private String categories;
    private String imageUrl;
    private double latitude;
    private double longitude;

    public Restaurant(String name, String phone, int rating, String address) {
        mId = UUID.randomUUID(); //random ID for a restaurant is auto generated
        this.name = name;
        this.phone = phone;
        this.rating = rating;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
