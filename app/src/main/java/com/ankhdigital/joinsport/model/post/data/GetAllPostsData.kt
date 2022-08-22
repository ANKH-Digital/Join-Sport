package com.ankhdigital.joinsport.model.post.data

import com.ankhdigital.joinsport.model.auth.data.UserData
import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class GetAllPostsData(
    @SerializedName("id") val id : Int,
    @SerializedName("user_id") val userId : Int,
    @SerializedName("caption") val caption : String,
    @SerializedName("created_at") val createdAt : String,
    @SerializedName("updated_at") val updatedAt : String,
    @SerializedName("user") val user : List<UserData>,
    @SerializedName("comments") val comments : List<CommentsData>,
    @SerializedName("images") val images : List<ImagesPostsData>
)
