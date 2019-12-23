package com.onesky.moviedatabase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi
{
    @GET("search/movie")
    fun getMovies(@Query("api_key") apiKey: String, @Query("query") query: String): Call<SearchResult>
}

class MovieRepository(private val movieApi: MovieApi?)
{
    fun getMovies(apiKey: String, query: String): LiveData<List<Movie?>?>
    {
        val movies = MutableLiveData<List<Movie?>?>()

        movieApi?.getMovies(apiKey, query)?.enqueue(object : Callback<SearchResult>
        {
            override fun onFailure(call: Call<SearchResult>, t: Throwable)
            {
                // Handle Error
            }

            override fun onResponse(call: Call<SearchResult>, response: Response<SearchResult>)
            {
                when (response.isSuccessful)
                {
                    true -> movies.value = response.body()?.results
                }
            }
        })

        return movies
    }
}

private fun setupRepo()
{
    val gson = GsonBuilder().create()

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(MainActivity.API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    val movieApi = retrofit.create<MovieApi>(MovieApi::class.java)
    val movieRepository = MovieRepository(movieApi)
}