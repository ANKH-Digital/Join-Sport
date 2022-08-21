package com.ankhdigital.joinsport.model.auth

import com.ankhdigital.joinsport.model.auth.data.MetaData
import com.ankhdigital.joinsport.model.auth.data.UserData
import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class Auth(
    @SerializedName("meta") val metadata: List<MetaData>,
    @SerializedName("data") val data : List<UserData>
)
