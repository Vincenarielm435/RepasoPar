package com.example.layoutsparcial.interfaces;

import com.example.layoutsparcial.Entity.Estudiante;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CRUDInterface {
    @GET("estudiante")
    Call<List<Estudiante>> getAll();

}
