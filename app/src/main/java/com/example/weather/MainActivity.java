package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.weather.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity  extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        OpenWeatherServices service =
                RetrofitClientInstance.getRetrofitInstance().create(OpenWeatherServices.class);
        Call<Forecast> callLondon = service.getForecast("London");
        callLondon.enqueue(new Callback<Forecast>() {

            @Override
            public void onResponse(Call<Forecast> call, Response<Forecast> response) {
                response.body();

            }



            @Override
            public void onFailure(Call<Forecast> call, Throwable t) {

            }
         binding.buttonLondon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    compteur.incrementer();
                    binding.compteur.setText(compteur.toString());
                }
            });
        });


    }

}