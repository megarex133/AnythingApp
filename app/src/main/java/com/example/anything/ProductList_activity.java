package com.example.anything;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class ProductList_activity extends AppCompatActivity {

    ImageView searchIcon;
    EditText searchText;

    ListView productList;
    ListView productPickedList;

    Button findButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        productList = (ListView) findViewById(R.id.productList);
        productList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.products,R.layout.product);
        productList.setAdapter(adapter);

        ArrayList<String> pickedProducts = new ArrayList<>();
        productPickedList = (ListView) findViewById(R.id.productPickedList);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, R.layout.product, pickedProducts);
        productList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                pickedProducts.add(item);
                productPickedList.setAdapter(adapter1);
                Toast.makeText(getApplicationContext(),"Clicked " + item, Toast.LENGTH_SHORT).show();
            }
        });



        searchIcon = (ImageView) findViewById(R.id.searchIcon);
        searchText = (EditText) findViewById(R.id.searchText);


        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchText.setVisibility(View.VISIBLE);
            }
        });

        findButton = (Button) findViewById(R.id.findButton);

        findButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


           startActivity(new Intent(ProductList_activity.this,Recepeis_activity.class));
            }
        });




    }
}