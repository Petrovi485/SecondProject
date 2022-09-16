package com.example.moneyretrofit.data.repository

import com.example.moneyretrofit.data.api.RetrofitInstance
import com.example.moneyretrofit.model.beznal.Beznalichka
import com.example.moneyretrofit.model.nal.Nalichka
import retrofit2.Response

class Repository {

    suspend fun getNal(): Response<Nalichka>{
        return RetrofitInstance.api.getNalichka()

    }

    suspend fun getBeznal(): Response<Beznalichka> {
        return RetrofitInstance.api.getBezNalichka()

    }
}