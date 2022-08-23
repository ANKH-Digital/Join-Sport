package com.ankhdigital.joinsport.model

import com.ankhdigital.joinsport.model.auth.LoginRegisRes
import com.ankhdigital.joinsport.model.auth.LogoutRes
import com.ankhdigital.joinsport.model.place.GetAllPlaceRes
import com.ankhdigital.joinsport.model.place.PlaceCommentRes
import com.ankhdigital.joinsport.model.place.ShowPlaceByIdRes
import com.ankhdigital.joinsport.model.post.*
import com.ankhdigital.joinsport.model.user.UpdateProfileRes
import com.ankhdigital.joinsport.model.user.FetchUserRes
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

    /* cara penggunaan API nya cukup mengeksekusi RClient.instances.{API}
    * pada setiap activity atau fragment yang ingin mengunakan API nya
    * lalu masukan untuk parameter auth token diambil dari model LoginRegistData.accessToken
    *
    * dan isi parameter untuk type RequestBody diset menjadi form-data
    * */


    //--------------- Auth API ---------------//
    @Multipart
    @POST("register")
    fun register(
        @Part("name") name : RequestBody,
        @Part("email") email : RequestBody,
        @Part("password") password : RequestBody,
        @Part("password_confirmation") passwordConfirm: RequestBody
    ) : Call<LoginRegisRes>

    @Multipart
    @POST("login")
    fun login(
        @Part("email") email : RequestBody,
        @Part("password") password : RequestBody
    ) : Call<LoginRegisRes>

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
    ) : Call<UpdateProfileRes>

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
    ) : Call<GetAllPostsRes>

    @Multipart
    @Headers("Accept: application/json")
    @POST("posts")
    fun createPost(
        @Header("Authorization") authToken: String,
        @Part("caption") caption : RequestBody,
        @Part("image") image: RequestBody
    ) : Call<CreatePostRes>

    @Multipart
    @Headers("Accept: application/json")
    @GET("posts/{id}")
    fun showPostById(
        @Header("Authorization") authToken: String,
        @Path("id") postId : String
    ) : Call<ShowPostByIdRes>

    @Multipart
    @Headers("Accept: application/json")
    @PUT("posts/{id}")
    fun updatePost(
        @Header("Authorization") authToken: String,
        @Path("id") postId: String,
        @Part("caption") caption : RequestBody,
        @Part("image") image : RequestBody
    ) : Call<UpdatePostRes>

    @Multipart
    @Headers("Accept: application/json")
    @DELETE("posts/{id}")
    fun deletePost(
        @Header("Authorization") authToken: String,
        @Path("id") postId: String
    ) : Call<DeletePostRes>

    @Multipart
    @Headers("Accept: application/json")
    @POST("posts/comment")
    fun postComment(
        @Header("Authorization") authToken: String,
        @Part("post_id") postId : RequestBody,
        @Part("comment") comment : RequestBody
    ) : Call<PostCommentRes>

    //--------------- Place API ---------------//
    @Multipart
    @Headers("Accept: application/json")
    @GET("places")
    fun getAllPlace(
        @Header("Authorization") authToken: String
    ) : Call<GetAllPlaceRes>

    @Multipart
    @Headers("Accept: application/json")
    @GET("places/{id}")
    fun showPlaceById(
        @Header("Authorization") authToken: String,
        @Path("id") id : String
    ) : Call<ShowPlaceByIdRes>

    @Multipart
    @Headers("Accept: application/json")
    @POST("places/comment")
    fun placeComment(
        @Header("Authorization") authToken: String,
        @Part("place_id") placeId : RequestBody,
        @Part("comment") comment : RequestBody
    ) : Call<PlaceCommentRes>
}