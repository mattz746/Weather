package com.example.weather;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Weather implements Serializable {
    @SerializedName("temp")
    private double temp;
    @SerializedName("feels_like")
    private double feelsLike;

    private int id;
    private String typeWeather;

    public Weather(int id, String typeWeather) {
        this.id = id;
        this.typeWeather = typeWeather;
    }

    public int getId() {
        return id;
    }

    public String getTypeWeather() {
        return typeWeather;
    }
}