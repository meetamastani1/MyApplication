package com.t20wc.myapplication;

import java.util.ArrayList;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface Api {

    @GET("V1/directory/currency")
    Call<ResponseData> getAllPhotos();

    @GET("V1/directory/countries")
    Call<ArrayList<CountryResponse>> getCountry(@Query("countryId") String param);
}