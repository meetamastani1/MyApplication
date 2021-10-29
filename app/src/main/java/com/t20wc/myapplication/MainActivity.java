package com.t20wc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Call<ArrayList<CountryResponse>> call = RetrofitClientInstance.getInstance().getMyApi().getCountry("AD");
        call.enqueue(new Callback<ArrayList<CountryResponse>>() {
            @Override
            public void onResponse(Call<ArrayList<CountryResponse>> call, Response<ArrayList<CountryResponse>> response) {
//                    CountryResponse myheroList = response.body();
                Log.d("TAG", "onResponse: " + response.body());

            }

            @Override
            public void onFailure(Call<ArrayList<CountryResponse>> call, Throwable t) {
                Log.d("TAG", "onResponseonFailure: " + t.toString());
            }

        });

    }
}