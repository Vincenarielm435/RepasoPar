package com.example.layoutsparcial;


import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.layoutsparcial.Entity.Estudiante;
import com.example.layoutsparcial.interfaces.CRUDInterface;

import java.sql.SQLOutput;
import java.util.List;



import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    List<Estudiante> estudiante;
    CRUDInterface crudInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAll();
    }

    private void getAll() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:9090/") // Cambia esto a tu URL base
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        crudInterface = retrofit.create(CRUDInterface.class);
        Call<List<Estudiante>> call = crudInterface.getAll();
        call.enqueue(new Callback<List<Estudiante>>() {
            @Override
            public void onResponse(Call<List<Estudiante>> call, Response<List<Estudiante>> response) {
                if (!response.isSuccessful()) {
                  Log.e("response err",response.message());
                    return;
                }
                estudiante = response.body();
                estudiante.forEach(p -> Log.i("Est: ",p.toString()));
            }

            @Override
            public void onFailure(Call<List<Estudiante>> call, Throwable t) {
                Log.e("Throw err",t.getMessage());
            }
        });
    }
}