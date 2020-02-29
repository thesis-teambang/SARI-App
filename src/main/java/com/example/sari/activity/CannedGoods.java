package com.example.sari.activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.SearchView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.sari.AdapterClass;
import com.example.sari.R;
import com.example.sari.ViewHolder;
import com.example.sari.model.Product;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;


public class CannedGoods extends AppCompatActivity {

    private TextView productBrand, productLocation, productType, productPrice;
    private  String productID = "";
    private Button addCartBtn;
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

        productID = getIntent().getStringExtra("pid");
        addCartBtn = findViewById(R.id.addCart);

        mLinearLayoutManager = new LinearLayoutManager(this);
        mLinearLayoutManager.setReverseLayout(true);
        mLinearLayoutManager.setStackFromEnd(true);
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mRecyclerView = findViewById(R.id.recyclerView);
        mDatabaseReference = mFirebaseDatabase.getReference("product");


        showData();
    }



    private void showData() {
        Query cannedGoodsQuery = mDatabaseReference.child("canned_goods");

        options = new FirebaseRecyclerOptions.Builder<Product>().setQuery(cannedGoodsQuery, Product.class).build();
        firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<Product, ViewHolder>(options) {

            @Override
            protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Product product) {

                holder.setDetails(getApplicationContext(), product.getAisle_number(), product.getBrand(), product.getPrice(),
                        product.getType(), product.getImage());
            }

            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cgoods,parent, false);

                ViewHolder viewHolder = new ViewHolder(itemView);
                viewHolder.setOnClickListener(new ViewHolder.ClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
//                        Toast.makeText(CannedGoods.this, "HELLO", Toast.LENGTH_SHORT).show();
                    }
                    @Override
                    public void onItemLongClick(View view, int position) {
//                        Toast.makeText(CannedGoods.this, "LONG CLICK", Toast.LENGTH_SHORT).show();
                    }
                });
                return viewHolder;
            }

        };

        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        firebaseRecyclerAdapter.startListening();
        mRecyclerView.setAdapter(firebaseRecyclerAdapter);
    }

    //back to categories
    public void choices(View view) {
        startActivity(new Intent(getApplicationContext(), Choices.class));

    }

    public void productList(View view) {
        Toast.makeText(CannedGoods.this, "Successfully Added", Toast.LENGTH_SHORT).show();
 }



}



