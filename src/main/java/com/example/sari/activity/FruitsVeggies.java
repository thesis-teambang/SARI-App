package com.example.sari.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sari.R;
import com.example.sari.ViewHolder;
import com.example.sari.model.Product;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class FruitsVeggies extends AppCompatActivity {

    LinearLayoutManager mLinearLayoutManager;
    RecyclerView mRecyclerView;
    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mDatabaseReference;
    FirebaseRecyclerAdapter<Product, ViewHolder> firebaseRecyclerAdapter;
    FirebaseRecyclerOptions<Product> options;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mLinearLayoutManager.setReverseLayout(true);
        mLinearLayoutManager.setStackFromEnd(true);


        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRecyclerView = findViewById(R.id.recyclerView);
        mDatabaseReference = mFirebaseDatabase.getReference("product");

        showData();
    }



    public void choices(View view) {
        startActivity(new Intent(getApplicationContext(), Choices.class));

    }


    private void showData() {
        Query fveggiesQuery = mDatabaseReference.child("fruits_veggies");


        options = new FirebaseRecyclerOptions.Builder<Product>().setQuery(fveggiesQuery, Product.class).build();

        firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Product, ViewHolder>(options) {

            @Override
            protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Product product) {

                holder.setDetails(getApplicationContext(), product.getAisle_number(), product.getBrand(), product.getPrice(),
                        product.getType(), product.getImage());
            }

            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_fruitsvegs,parent, false);

                ViewHolder viewHolder = new ViewHolder(itemView);
                viewHolder.setOnClickListener(new ViewHolder.ClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

//                        Toast.makeText(FruitsVeggies.this, "HELLO", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onItemLongClick(View view, int position) {
//                        Toast.makeText(FruitsVeggies.this, "LONG CLICK", Toast.LENGTH_SHORT).show();

                    }
                });
                return viewHolder;
            }
        };

        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        firebaseRecyclerAdapter.startListening();
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }


    protected void onStart() {
        super.onStart();
        if(firebaseRecyclerAdapter != null){
            firebaseRecyclerAdapter.startListening();
        }
    }
    public void productList(View view) {
        Toast.makeText(FruitsVeggies.this, "Successfully Added", Toast.LENGTH_SHORT).show();
    }


}
