package com.cuisine_mart.beans;

import org.springframework.stereotype.Component;

/**
 * Created by Rajiv on 8/30/2016.
 */
@Component("RestaurantMenuBean")
public class RestaurantInfoBean {
    public RestaurantInfoBean(){
        super();
    }

    public RestaurantInfoBean(String name,String description,String street,String city,String zip,String state,
                              String phoneNumber,Long id,Long cuisineId,String email){
        this.name = name;
        this.description = description;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.cuisineId = cuisineId;
        this.email = email;

    }



    private String email;
    private Long id;

    private String name;
    private String description;
    private String street;
    private String city;
    private String zip;
    private String state;
    private String phoneNumber;
    private Long cuisineId;

    private String image;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getCuisineId() {
        return cuisineId;
    }

    public void setCuisineId(Long cuisineId) {
        this.cuisineId = cuisineId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
