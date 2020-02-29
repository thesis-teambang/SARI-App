package com.example.sari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sari.activity.Meals;

public class MechadongBaboy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechadong_baboy);
    }

    public void productList(View view) {
        Toast.makeText(MechadongBaboy.this, "Successfully Added", Toast.LENGTH_SHORT).show();
    }
}
