package com.example.ejemplomvvm.di
import com.example.ejemplomvvm.data.Network.QuoteApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn (SingletonComponent::class)
object NetworkModule {
    @Singleton
    @Provides
    fun provideRetrifit():Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun provideQuoteApi(retrofit:Retrofit):QuoteApiClient{
        return retrofit.create(QuoteApiClient::class.java)
    }
}