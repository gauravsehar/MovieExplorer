package com.example.gauravsehar.movieexplorer.api

import com.google.gson.annotations.SerializedName
import java.util.*
import kotlin.collections.ArrayList

class MovieDetail {

    @SerializedName("adult")
    var isAdult: Boolean = false

    @SerializedName("backdrop_path")
    var backdropPath: String? = null

    //belongs_to_collection may be string

    var budget: Long = 0

    var genres: ArrayList<Genre>? = null

    var homepage: String? = null

    var id: Int = 0

    @SerializedName("imdb_id")
    var imdbId: String? = null

    @SerializedName("original_language")
    var originalLanguage: String? = null

    @SerializedName("original_title")
    var originalTitle: String? = null

    var overview: String? = null

    var popularity: Float = 0.toFloat()

    @SerializedName("poster_path")
    var posterPath: String? = null

    @SerializedName("production_companies")
    var productionCompanies: ArrayList<ProductionCompanies>? = null

    @SerializedName("release_date")
    var releaseDate: Date? = null//2018-02-07

    var revenue: Long = 0

    var runtime: Int = 0

    @SerializedName("spoken_languages")
    var spokenLanguages: String? = null

    var status: String? = null

    var tagline: String? = null

    var title: String? = null

    @SerializedName("production_countries")
    var ProductionCountries: ArrayList<ProductionCountries>? = null

    @SerializedName("vote_count")
    var voteCount: Int = 0

    @SerializedName("video")
    var isVideo: Boolean = false

    @SerializedName("vote_average")
    var voteAverage: Float = 0.toFloat()
}