package com.example.gauravsehar.movieexplorer.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Gaurav Sehar on 24-Mar-18.
 */

public class ApiClient {

    private static ApiClient INSTANCE;

    private TmdbApi tmdbApi;

    private ApiClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        tmdbApi = retrofit.create(TmdbApi.class);
    }

    public static ApiClient getInstance() {
        if(INSTANCE == null){
            INSTANCE = new ApiClient();
        }
        return INSTANCE;
    }

    public TmdbApi getTmdbApi() {
        return tmdbApi;
    }
}
