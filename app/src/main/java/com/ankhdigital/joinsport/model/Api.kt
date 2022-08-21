package com.ankhdigital.joinsport.model

import com.ankhdigital.joinsport.model.auth.Auth
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
interface Api {
    @Multipart
    @POST("register")
    fun register(
        @Part("name") name : RequestBody,
        @Part("email") email : RequestBody,
        @Part("password") password : RequestBody,
        @Part("password_confirmation") passwordConfirm: RequestBody
    ) : Call<Auth>

}