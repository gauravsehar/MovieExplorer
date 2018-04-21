package com.example.gauravsehar.movieexplorer.api

import com.google.gson.annotations.SerializedName

class ProductionCompanies {

    var id: Int = 0

    @SerializedName("logo_path")
    var logoPath: String? = null

    var name: String? = null

    @SerializedName("origin_country")
    var OriginCountry: String? = null
}