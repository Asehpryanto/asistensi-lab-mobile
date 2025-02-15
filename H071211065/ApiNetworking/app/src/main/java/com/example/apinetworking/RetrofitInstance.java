package com.example.apinetworking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static String BASE_URL= "https://reqres.in/";

    public static ApiInterface getService(){
            Retrofit retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        return retrofit.create(ApiInterface.class);
    }
}
