package com.ankhdigital.joinsport.model.auth.data

import com.google.gson.annotations.SerializedName


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
data class UserData(
    @SerializedName("id") val id : String,
    @SerializedName("name") val name : String,
    @SerializedName("email") val email : String,
    @SerializedName("email_verified_at") val emailVerify : String?,
    @SerializedName("two_factor_confirmed_at") val twoFactorConfirm : String?,
    @SerializedName("location") val location : String?,
    @SerializedName("phone") val phone : String?,
    @SerializedName("current_team_id") val currentTeamId : String?,
    @SerializedName("profile_photo_path") val profilePhoto : String?,
    @SerializedName("created_at") val createdAt : String,
    @SerializedName("updated_at") val updateAt : String,
    @SerializedName("profile_photo_url") val profilePhotoUrl : String

)
