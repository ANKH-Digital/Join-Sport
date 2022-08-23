package com.ankhdigital.joinsport.model.place.data

import com.ankhdigital.joinsport.model.place.data.subdata.ListCommentData
import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 23/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class ShowPlaceByIdData(
    @SerializedName("title") val title : String,
    @SerializedName("description") val desc : String,
    @SerializedName("address") val address : String,
    @SerializedName("image") val image : String,
    @SerializedName("ListComment") val listComment : List<ListCommentData>
)
