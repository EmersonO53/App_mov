package com.example.ejemplomvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.ejemplomvvm.model.QuoteModel
import com.example.ejemplomvvm.model.QuoteProvider

class QuoteViewModel:ViewModel() {
    val quoteModel= MutableLiveData<QuoteModel>()
    fun randomQuote(){
        val currentQuote:QuoteModel=QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}