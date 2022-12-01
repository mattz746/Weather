package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OpenWeatherServices service =
                RetrofitClientInstance.getRetrofitInstance().create(OpenWeatherServices.class);
        Call<Forecast> call = service.getForcast();
        call.enqueue(new Callback<Forecast>() {

            @Override
            public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                response.body();

            }

            @Override
            public void onFailure(Call<Forecast> call, Throwable t) {

            }

        });
    }

}