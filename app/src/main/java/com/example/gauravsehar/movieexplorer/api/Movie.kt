package com.example.gauravsehar.movieexplorer.api

import com.google.gson.annotations.SerializedName

import java.util.ArrayList
import java.util.Date

/**
 * Created by Gaurav Sehar on 24-Mar-18.
 */

class Movie {

    @SerializedName("vote_count")
    var voteCount: Int = 0

    var id: Int = 0

    var isVideo: Boolean = false

    @SerializedName("vote_average")
    var voteAverage: Float = 0.toFloat()

    var title: String? = null

    var popularity: Float = 0.toFloat()

    @SerializedName("poster_path")
    var posterPath: String? = null

    @SerializedName("original_language")
    var originalLanguage: String? = null

    @SerializedName("original_title")
    var originalTitle: String? = null

    @SerializedName("genre_ids")
    var genreIds: ArrayList<Int>? = null

    @SerializedName("backdrop_path")
    var backdropPath: String? = null

    var isAdult: Boolean = false

    var overview: String? = null

    @SerializedName("release_date")
    var releaseDate: Date? = null//2018-02-07
}

/*public class Movie {

    @SerializedName("vote_count")
    private int voteCount;

    private int id;

    private boolean video;

    @SerializedName("vote_average")
    private float voteAverage;

    private String title;

    private float popularity;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("original_language")
    private String originalLanguage;

    @SerializedName("original_title")
    private String originalTitle;

    @SerializedName("genre_ids")
    private ArrayList<Integer> genreIds;

    @SerializedName("backdrop_path")
    private String backdropPath;

    private boolean adult;

    private String overview;

    @SerializedName("release_date")
    private Date releaseDate;//2018-02-07

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int voteCount) {
        this.voteCount = voteCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public float getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(float voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPopularity() {
        return popularity;
    }

    public void setPopularity(float popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public ArrayList<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(ArrayList<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}*/