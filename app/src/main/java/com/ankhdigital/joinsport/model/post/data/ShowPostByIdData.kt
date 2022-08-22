package com.ankhdigital.joinsport.model.post.data

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class ShowPostByIdData(
    @SerializedName("caption") val caption : String,
    @SerializedName("imagePost") val imagePost: String,
    @SerializedName("comment") val comment : String?
)
