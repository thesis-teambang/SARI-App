package com.example.sari.activity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.sari.R;
import com.google.firebase.auth.FirebaseAuth;

public class Choices extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void logout(View view){
        FirebaseAuth.getInstance().signOut();//logout user
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }

    public void meals(View view) {
        startActivity(new Intent(getApplicationContext(), Meals.class));
        finish();

    }

    public void products(View view){
        startActivity(new Intent(getApplicationContext(), Category.class));
        finish();

    }

    public void cart(View view){
        startActivity(new Intent(getApplicationContext(), CartActivity.class));

    }

}
