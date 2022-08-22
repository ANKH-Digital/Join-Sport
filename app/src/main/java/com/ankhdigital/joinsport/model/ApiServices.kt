package com.ankhdigital.joinsport.model

import com.ankhdigital.joinsport.model.auth.RegisterRequest
import com.ankhdigital.joinsport.model.auth.res.LogoutRes
import com.ankhdigital.joinsport.model.post.CreatePostRequest
import com.ankhdigital.joinsport.model.post.GetAllPostsRequest
import com.ankhdigital.joinsport.model.post.ShowPostByIdRequest
import com.ankhdigital.joinsport.model.user.UserUpdateRequest
import com.ankhdigital.joinsport.model.user.res.FetchUserRes
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*


/**
 * Created by Ardian Iqbal Yusmartito on 22/08/22
 * Github : https://github.com/ALU-syntax
 * Twitter : https://twitter.com/mengkerebe
 * Instagram : https://www.instagram.com/ardian_iqbal_
 * LinkedIn : https://www.linkedin.com/in/ardianiqbal
 */
interface ApiServices {

    //--------------- Auth API ---------------//
    @Multipart
    @POST("register")
    fun register(
        @Part("name") name : RequestBody,
        @Part("email") email : RequestBody,
        @Part("password") password : RequestBody,
        @Part("password_confirmation") passwordConfirm: RequestBody
    ) : Call<RegisterRequest>

    @Multipart
    @POST("login")
    fun login(
        @Part("email") email : RequestBody,
        @Part("password") password : RequestBody
    ) : Call<RegisterRequest>

    @Multipart
    @Headers("Accept: application/json")
    @POST("logout")
    fun logout(
        @Header("Authorization") authToken : String
    ) : Call<LogoutRes>


    //--------------- User API ---------------//
    @Multipart
    @Headers("Accept: application/json")
    @POST("user/update")
    fun updateProfile(
        @Header("Authorization") authToken: String,
        @Part("name") name : RequestBody,
        @Part("email") email: RequestBody,
        @Part("location") location : RequestBody,
        @Part("phone") phone :RequestBody,
        @Part("photo") photo : RequestBody
    ) : Call<UserUpdateRequest>

    @Multipart
    @Headers("Accept: application/json")
    @GET("user/fetch")
    fun fetchUser(
        @Header("Authorization") authToken: String
    ) : Call<FetchUserRes>


    //--------------- Post API ---------------//

    @Multipart
    @Headers("Accept: application/json")
    @GET("posts")
    fun getAllPosts(
        @Header("Authorization") authToken : String,
    ) : Call<GetAllPostsRequest>

    @Multipart
    @Headers("Accept: application/json")
    @POST("posts")
    fun createPost(
        @Header("Authorization") authToken: String,
        @Part("caption") caption : RequestBody,
        @Part("image") image: RequestBody
    ) : Call<CreatePostRequest>

    @Multipart
    @Headers("Accept: application/json")
    @GET("posts/{id}")
    fun showPostById(
        @Header("Authorization") authToken: String,
        @Path("id") postId : String
    ) : Call<ShowPostByIdRequest>



}