package com.example.moneyretrofit.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.moneyretrofit.data.repository.Repository
import com.example.moneyretrofit.model.nal.Nalichka
import com.example.moneyretrofit.model.nal.NalichkaItem
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel: ViewModel() {


    var repo = Repository()

    var myMoneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney(){

        viewModelScope.launch {

            myMoneyList.value = repo.getNal()
        }

    }


}