package com.learn2crack.imageupload;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface RetrofitInterface {

    @Multipart
    @POST("upload?expiration=600&key=7568b1450400a4241b9753be95ee2091")
    Call<Response> uploadImage(@Part MultipartBody.Part image);
}
