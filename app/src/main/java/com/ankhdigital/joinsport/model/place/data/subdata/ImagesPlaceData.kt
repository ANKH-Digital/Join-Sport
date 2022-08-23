package com.ankhdigital.joinsport.model.place.data.subdata

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 23/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class ImagesPlaceData(
    @SerializedName("id") val id : Int,
    @SerializedName("image") val image : String,
    @SerializedName("place_id") val placeId : Int,
    @SerializedName("created_at") val createdAt : String,
    @SerializedName("updated_at") val updatedAt : String
)
