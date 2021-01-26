package com.example.newsapp.api

import android.provider.Settings.Global.getString
import com.example.newsapp.R
import com.example.newsapp.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(

            @Query("country")
            countryCode:String = "us",
            @Query("page")
            pageNumber: Int = 1,
            @Query("apiKey")
            apiKey: String = Constants.API_KEY

    )
}