package com.example.ejemplomvvm.data

import com.example.ejemplomvvm.data.Network.QuoteService
import com.example.ejemplomvvm.data.model.QuoteModel
import com.example.ejemplomvvm.data.model.QuoteProvider
import javax.inject.Inject

class QuoteRepository @Inject constructor( private val api : QuoteService, private val quoteProvider: QuoteProvider) {



    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}