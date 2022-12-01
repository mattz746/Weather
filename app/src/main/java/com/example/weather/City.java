package com.example.weather;public class City {

    private int id;
    private String name;
    private String state;
    private String postalCode;
    private String country;

    public City(int id, String name, String state, String postalCode, String country) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }
}
