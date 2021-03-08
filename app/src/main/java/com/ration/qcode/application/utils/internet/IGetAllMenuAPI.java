package com.ration.qcode.application.utils.internet;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IGetAllMenuAPI {

    @GET("/querymenu.php")
    Call<List<MenuResponse>> getAllMenu();
}
