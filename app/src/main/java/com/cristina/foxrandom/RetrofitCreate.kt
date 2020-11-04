package com.cristina.foxrandom

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitCreate{
    companion object{
        @JvmStatic
        private val retrofit = Retrofit.Builder()
            .baseUrl("https://randomfox.ca/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val foxSerive = retrofit.create(FoxService::class.java)
    }
}