package com.ankhdigital.joinsport.model.user.data

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class PostData(
    @SerializedName("id") val id : Int,
    @SerializedName("user_id") val userId : Int,
    @SerializedName("caption") val caption : String,
    @SerializedName("created_at") val createdAt : String,
    @SerializedName("updated_at") val updateAt : String,
    @SerializedName("images") val images : List<ImagesPostData>
)