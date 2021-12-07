package com.example.myapplication321

import com.example.myapplication321.model.Custom
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitServices2  {

    @GET("api/v1/mobile/orders/{id}")
    fun getMovieList1(@Path("id") id: String): Call<Custom>

}