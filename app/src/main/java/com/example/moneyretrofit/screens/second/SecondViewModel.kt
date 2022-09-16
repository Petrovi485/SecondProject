package com.example.moneyretrofit.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moneyretrofit.data.repository.Repository
import com.example.moneyretrofit.model.beznal.Beznalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel: ViewModel() {


    var repo = Repository()

    var myMoneyList: MutableLiveData<Response<Beznalichka>> = MutableLiveData()

    fun getBezNalMoney(){

        viewModelScope.launch {

            myMoneyList.value = repo.getBeznal()
        }

    }



}