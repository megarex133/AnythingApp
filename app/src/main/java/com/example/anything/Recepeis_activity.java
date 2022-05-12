package com.example.anything;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.List;

public class Recepeis_activity extends AppCompatActivity {

    ImageView searchIcon;
    EditText searchText;

    ImageView profile;

    RecyclerView mRecyclerView;
    List<RecipesData>  recipesList;
    RecipesData mRecipesData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepeis);

        // Функционал при нажатии на кнопку поиска
        searchIcon = (ImageView) findViewById(R.id.searchIcon);
        searchText = (EditText) findViewById(R.id.searchText);


        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchText.setVisibility(View.VISIBLE);
            }
        });

        // Функционал при нажатии на кнопку профиля
        profile = (ImageView) findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Recepeis_activity.this,ProductList_activity.class));
            }
        });

        // Функционал вывода рецептов
        mRecyclerView = (RecyclerView) findViewById(R.id.recipes);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Recepeis_activity.this, 1);



    }
}