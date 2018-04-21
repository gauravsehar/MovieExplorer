package com.example.gauravsehar.movieexplorer.api

import com.google.gson.annotations.SerializedName

class ProductionCountries {
    @SerializedName("iso_3166_1")
    var code: String? = null
    var name: String? = null
}