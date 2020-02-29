package com.example.sari.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.sari.AdobongManok;
import com.example.sari.ChopsueyMeal;
import com.example.sari.LumpiangPrito;
import com.example.sari.LumpiangShanghai;
import com.example.sari.MechadongBaboy;
import com.example.sari.R;
import com.example.sari.ViewHolder;
import com.example.sari.model.Meal;
import com.example.sari.model.Product;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class Meals extends AppCompatActivity {
    
    LinearLayoutManager mLinearLayoutManager;
    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mDatabaseReference;
    FirebaseRecyclerAdapter<Meal, ViewHolder> firebaseRecyclerAdapter;
    FirebaseRecyclerOptions<Meal> options;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);


    }

    //go back to choices
    public void choices(View view) {
        startActivity(new Intent(getApplicationContext(), Choices.class));
    }

    public void mBaboy(View view) {
        startActivity(new Intent(getApplicationContext(), MechadongBaboy.class));
    }

    public void adManok(View view) {
        startActivity(new Intent(getApplicationContext(), AdobongManok.class));
    }

    public void lShanghai(View view) {
        startActivity(new Intent(getApplicationContext(), LumpiangShanghai.class));
    }

    public void chopsueyView(View view) {
        startActivity(new Intent(getApplicationContext(), ChopsueyMeal.class));
    }

    public void lPrito(View view) {
        startActivity(new Intent(getApplicationContext(), LumpiangPrito.class));
    }

    public void back(View view) {
        startActivity(new Intent(getApplicationContext(), Choices.class));

    }


}
