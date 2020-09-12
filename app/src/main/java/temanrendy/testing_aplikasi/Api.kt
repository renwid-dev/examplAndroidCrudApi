package temanrendy.testing_aplikasi

import android.icu.text.CaseMap
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.*

interface Api{
    @GET("https://jsonplaceholder.typicode.com/posts")
    fun getPosts(
        @Query("userId") userId: Int,
        @Query("id") id: Int
        ): Call<ArrayList<PostResponse>>

    //manipulation posts
    @GET("posts")
    fun getPosts(
        @QueryMap parameters: HashMap<String, String>
    ):Call<ArrayList<PostResponse>>

    //manipulation post melalui URL
    @GET
    fun getComment(@Url url: String): Call<ArrayList<CommentResponse>>

    @GET("posts/{id}/comments")
    fun getComment(@Path("id") postId: Int): Call<ArrayList<CommentResponse>>

    @FormUrlEncoded
    @POST("posts")
    fun createPost(
        @Field("userId") userId: Int,
        @Field("title") title: String,
        @Field("body") text: String
    ): Call<CreatedpostResponse>

    @FormUrlEncoded
    @PUT("posts/{id}")
    fun putPost(
        @Path("id") id: Int,
        @Field("userId") userId: Int,
        @Field("id") idField: Int,
        @Field("title") title: String?,
        @Field("body") body: String?
    ): Call<PostResponse>

    @FormUrlEncoded
    @PATCH("posts/{id}")
    fun patchPost(
        @Path("id") id: Int,
        @Field("userId") userId: Int,
        @Field("id") idField: Int,
        @Field("title") title: String?,
        @Field("body") body: String?
    ): Call<PostResponse>

    @DELETE("posts/{nomer}")
    fun deletePost(@Path("nomer") id: Int): Call<Void>
}