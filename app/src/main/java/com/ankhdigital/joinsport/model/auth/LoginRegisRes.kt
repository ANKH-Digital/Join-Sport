package com.ankhdigital.joinsport.model.auth

import com.ankhdigital.joinsport.model.MetaRes
import com.ankhdigital.joinsport.model.auth.data.LoginRegisData
import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class LoginRegisRes(
    @SerializedName("meta") val metadata: List<MetaRes>,
    @SerializedName("data") val data : List<LoginRegisData>
)
