package com.ankhdigital.joinsport.model.place

import com.ankhdigital.joinsport.model.MetaRes
import com.ankhdigital.joinsport.model.place.data.ShowPlaceByIdData
import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 23/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class ShowPlaceByIdRes(
    @SerializedName("meta") val meta : List<MetaRes>,
    @SerializedName("data") val data : List<ShowPlaceByIdData>
)
