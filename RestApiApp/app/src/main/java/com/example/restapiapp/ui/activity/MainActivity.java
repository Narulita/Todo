package com.example.restapiapp.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.Call;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Toast;

import com.example.restapiapp.R;
import com.example.restapiapp.data.conf.NetworkConf;
import com.example.restapiapp.data.model.Todo;
import com.example.restapiapp.data.service.ApiService;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiService apiService = NetworkConf.getApiService();


        apiService.requestListTodo().enqueue(new Callback<ArrayList<Todo>> (){
            @Override
            public void onResponse(Call<ArrayList<Todo>> call, Response<ArrayList<Todo>> response) {
            ArrayList<Todo> todos = response.body();
            Toast.makeText(MainActivity.this, "data dari server" + todos.size() Toast.LENGTH_SHORT).show();
        }

        @Override
                public void onFailure(Call<ArrayList<Todo>> call, Throwable t) {
                Toast.makeText (MainActivity.this, "terjadi kesalahan"  Toast.LENGTH_SHORT).show();
        }
}