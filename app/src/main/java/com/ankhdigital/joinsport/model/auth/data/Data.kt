package com.ankhdigital.joinsport.model.auth.data

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class Data(
    @SerializedName("access_token") val accessToken :String,
    @SerializedName("token_type") val tokenType: String,
    @SerializedName("user") val user : List<UserData>
)
