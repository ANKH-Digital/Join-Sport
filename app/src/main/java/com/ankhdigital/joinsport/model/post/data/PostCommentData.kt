package com.ankhdigital.joinsport.model.post.data

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 23/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class PostCommentData(
    @SerializedName("post_id") val postId : String,
    @SerializedName("user_id") val userId : Int,
    @SerializedName("comment") val comment : String,
    @SerializedName("updated_at") val updateAt : String,
    @SerializedName("created_at") val createdAt : String,
    @SerializedName("id") val id : Int
)
