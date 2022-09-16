package com.example.moneyretrofit.data.api
import com.example.moneyretrofit.model.beznal.Beznalichka
import com.example.moneyretrofit.model.nal.Nalichka
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET ("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getNalichka(): Response<Nalichka>



    @GET ("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getBezNalichka(): Response<Beznalichka>



}