package com.ankhdigital.joinsport.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
object RClient {
    private const val BASE_URL = "https://sport.ankhproject.my.id/api/"
    val instance : ApiServices by lazy{
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiServices::class.java)
    }
}