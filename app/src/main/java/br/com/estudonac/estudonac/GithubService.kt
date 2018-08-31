package br.com.estudonac.estudonac

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService{
    @GET("/users/{username}")
    fun buscarUsuario(@Path("username")username: String) : Call<Usuario>
}