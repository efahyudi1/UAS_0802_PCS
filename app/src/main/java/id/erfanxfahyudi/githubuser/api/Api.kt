package id.erfanxfahyudi.githubuser.api

import id.erfanxfahyudi.githubuser.data.model.DetailUserResponse
import id.erfanxfahyudi.githubuser.data.model.User
import id.erfanxfahyudi.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token c6cfaed744910d53575bd9fe6018406e8af43461")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token c6cfaed744910d53575bd9fe6018406e8af43461")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token c6cfaed744910d53575bd9fe6018406e8af43461")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token c6cfaed744910d53575bd9fe6018406e8af43461")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}