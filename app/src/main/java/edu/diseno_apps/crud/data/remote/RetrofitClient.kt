package edu.diseno_apps.crud.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    // Usa 10.0.2.2 si pruebas en el emulador de Android Studio hacia localhost
    private const val BASE_URL = "http://10.0.2.2/alumnos_api/"

    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}