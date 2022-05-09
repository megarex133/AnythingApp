package com.example.anything;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Recepeis_activity extends AppCompatActivity {

    ImageView searchIcon;
    EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recepeis);

        searchIcon = (ImageView) findViewById(R.id.searchIcon);
        searchText = (EditText) findViewById(R.id.searchText);


        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchText.setVisibility(View.VISIBLE);
            }
        });
    }
}