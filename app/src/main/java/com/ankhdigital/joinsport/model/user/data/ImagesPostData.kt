package com.ankhdigital.joinsport.model.user.data

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class ImagesPostData(
    @SerializedName("id") val id : Int,
    @SerializedName("post_id") val postId : Int,
    @SerializedName("image") val image : String,
    @SerializedName("created_at") val createdAt : String,
    @SerializedName("updated_at") val updateAt : String
)
