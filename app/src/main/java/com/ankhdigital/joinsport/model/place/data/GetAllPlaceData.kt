package com.ankhdigital.joinsport.model.place.data

import com.ankhdigital.joinsport.model.place.data.subdata.ImagesPlaceData
import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 23/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class GetAllPlaceData(
    @SerializedName("id") val id : Int,
    @SerializedName("title") val title : String,
    @SerializedName("description") val desc : String,
    @SerializedName("address") val address : String,
    @SerializedName("created_at") val createdAt : String,
    @SerializedName("updated_at") val updatedAt : String,
    @SerializedName("comments") val comments : String?,
    @SerializedName("images") val images : List<ImagesPlaceData>
)
