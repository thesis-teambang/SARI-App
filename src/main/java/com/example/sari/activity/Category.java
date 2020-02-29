package com.example.sari.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import com.example.sari.R;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
    }


    //back to mainpage OK
    public void mainPage(View view) {
        startActivity(new Intent(getApplicationContext(), Choices.class));
        finish();

    }

    //to canned goods OK
    public void cannedGoods(View view) {
        startActivity(new Intent(getApplicationContext(), CannedGoods.class));

    }

    //to dairy products OK
    public void dairyProducts(View view) {
        startActivity(new Intent(getApplicationContext(), DairyProducts.class));
    }



    public void fruitsVeggies(View view) {
        startActivity(new Intent(getApplicationContext(),FruitsVeggies.class));
    }
    public void meatSection(View view) {
        startActivity(new Intent(getApplicationContext(),MeatSection.class));
    }

    public void pastaSection(View view) {
        startActivity(new Intent(getApplicationContext(),PastaSection.class));
    }
    public void spicesito(View view) {
        startActivity(new Intent(getApplicationContext(), SpicesSection.class));
    }

    public void cart(View view) {
        startActivity(new Intent(getApplicationContext(), CartActivity.class));
    }




}
