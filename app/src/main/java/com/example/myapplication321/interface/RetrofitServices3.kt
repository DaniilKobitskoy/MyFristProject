package com.example.myapplication321

import com.example.myapplication321.model.Status
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServices3 {

    @GET("/api/v1/mobile/orders/statuses")
    fun getMovieList3() : Call<Status>

}