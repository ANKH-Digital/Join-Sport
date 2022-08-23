package com.ankhdigital.joinsport.model.post.data.subdata

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class CommentsData(
    @SerializedName("id") val id : Int,
    @SerializedName("user_id") val userId : Int,
    @SerializedName("post_id") val postId : Int,
    @SerializedName("comment") val comment : String,
    @SerializedName("created_at") val createdAt : String,
    @SerializedName("updated_at") val updatedAt : String
)
