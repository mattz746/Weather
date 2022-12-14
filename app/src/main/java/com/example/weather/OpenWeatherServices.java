package com.example.weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OpenWeatherServices {
    @GET("weather?units=metric&appid=e075a0b59517e88cc46940bb262add13")
    Call<Forecast> getForecast(@Query("q") String city);

}
