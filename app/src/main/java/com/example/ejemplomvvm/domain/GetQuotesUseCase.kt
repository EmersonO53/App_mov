package com.example.ejemplomvvm.domain

import com.example.ejemplomvvm.data.QuoteRepository
import com.example.ejemplomvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor( private val repository : QuoteRepository) {



    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()

}