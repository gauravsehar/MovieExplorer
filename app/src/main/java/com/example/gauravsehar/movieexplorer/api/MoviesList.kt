package com.example.gauravsehar.movieexplorer.api

import com.google.gson.annotations.SerializedName

import java.util.ArrayList

/**
 * Created by Gaurav Sehar on 24-Mar-18.
 */

class MoviesList {
    var page: Int = 0

    @SerializedName("total_results")
    var totalResults: Int = 0

    @SerializedName("total_pages")
    var totalPages: Int = 0

    @SerializedName("results")
    var movies: ArrayList<Movie>? = null
}

/*public class MoviesList {
    private int page;

    @SerializedName("total_results")
    private int totalResults;

    @SerializedName("total_pages")
    private int totalPages;

    @SerializedName("results")
    private ArrayList<Movie> Movies;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public ArrayList<Movie> getMovies() {
        return Movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        Movies = movies;
    }
}*/
