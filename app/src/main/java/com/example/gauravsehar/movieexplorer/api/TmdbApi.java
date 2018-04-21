package com.example.gauravsehar.movieexplorer.api;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Gaurav Sehar on 24-Mar-18.
 */

public interface TmdbApi {

    @GET("movie/popular")
    Call<MoviesList> getPopularMovies(@Query("api_key") String api_key, @Query("language") String language, @Query("page") int pageNo);

    @GET("movie/now_playing")
    Call<MoviesList> getNowPlayingMovies(@Query("api_key") String api_key, @Query("language") String language, @Query("page") int pageNo);

    @GET("genre/movie/list")
    Call<ArrayList<Genre>> getGenres(@Query("api_key") String api_key, @Query("language") String language);

//    @GET("/movie/269149?api_key=74928b48577999fbeef31f709f78892d&language=en-US")
//    Call<MovieDetail> 
}
