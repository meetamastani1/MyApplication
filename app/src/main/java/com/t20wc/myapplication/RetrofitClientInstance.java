package com.t20wc.myapplication;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://magecomp.org/rest/all/";

    private static RetrofitClientInstance instance = null;
    private Api myApi;

    private RetrofitClientInstance() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(Api.class);
    }

    public static synchronized RetrofitClientInstance getInstance() {
        if (instance == null) {
            instance = new RetrofitClientInstance();
        }
        return instance;
    }

    public Api getMyApi() {
        return myApi;
    }
}