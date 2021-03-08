package com.ration.qcode.application.utils.internet;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UpdateProductAPI {
    @FormUrlEncoded
    @POST("/removeProductFromCompl.php")
    Call<String> updateComplicated(@Field("Name") String name, @Field("product") String product);
}
