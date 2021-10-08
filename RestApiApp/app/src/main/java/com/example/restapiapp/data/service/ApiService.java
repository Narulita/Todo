package com.example.restapiapp.data.service;

import java.util.ArrayList;

public interface ApiService {

    @GET("v1/todo")
    Call<ArrayList<Todo>> requestListTodo();
}
