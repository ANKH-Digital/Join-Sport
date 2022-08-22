package com.ankhdigital.joinsport.model.user.data

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class FetchUserData(
    @SerializedName("nama") val nama : String,
    @SerializedName("email") val email : String,
    @SerializedName("lokasi") val lokasi : String?,
    @SerializedName("telp") val telfon : Int?,
    @SerializedName("foto") val foto : String,
    @SerializedName("post") val post : List<PostDataModel>

)
