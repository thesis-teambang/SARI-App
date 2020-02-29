package com.example.sari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ChopsueyMeal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chopsuey_meal);
    }
    public void productList(View view) {
        Toast.makeText(ChopsueyMeal.this, "Successfully Added", Toast.LENGTH_SHORT).show();
    }
}
