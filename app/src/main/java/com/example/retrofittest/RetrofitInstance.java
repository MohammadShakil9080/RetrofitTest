package com.example.retrofittest;

import static com.example.retrofittest.MainActivity.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
   public static RetrofitInstance instance;
    ApInterface apInterface;
    RetrofitInstance(){
        Retrofit retrofit=new  Retrofit.Builder()
                .baseUrl(api)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apInterface=retrofit.create(ApInterface.class);

    }
    public static RetrofitInstance getInstance(){
        if (instance==null){
            instance = new RetrofitInstance();
        }
        return instance;
    }


}
