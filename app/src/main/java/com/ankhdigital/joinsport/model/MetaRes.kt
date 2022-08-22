package com.ankhdigital.joinsport.model

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class MetaRes(
    @SerializedName("code") val res : Int,
    @SerializedName("status") val status : String,
    @SerializedName("message") val message : String
)
