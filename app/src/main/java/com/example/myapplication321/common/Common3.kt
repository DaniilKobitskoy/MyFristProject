package com.example.myapplication321.common

import com.example.myapplication321.RetrofitServices3
import com.example.myapplication321.retrofit2.RetrofitClient

object Common3 {


    private val BASE_URL = "http://80.78.246.225:3000/"
    //private val BASE_URL = "https://api.letsbuildthatapp.com/"
    val retrofitService: RetrofitServices3
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitServices3::class.java)

}