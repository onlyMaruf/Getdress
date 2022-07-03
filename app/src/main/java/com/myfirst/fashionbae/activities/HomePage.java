package com.myfirst.fashionbae.activities;

import androidx.appcompat.app.AppCompatActivity;
import com.myfirst.fashionbae.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomePage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        clickListener();





    }
    public void clickListener(){
        ImageView tShirt=findViewById(R.id.imageViewTshirt);
        ImageView Shirt=findViewById(R.id.imageViewshirt);
        ImageView shop= findViewById(R.id.shop);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShop();
            }
        });




        tShirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTshirt();
            }
        });
        Shirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShirt();
            }
        });




    }
    public  void openTshirt(){
        startActivity(new Intent(HomePage.this, Tshirt.class));

    }
    public  void openShirt(){
        startActivity(new Intent(HomePage.this, shirt.class));

    }
    public  void openFootWear(){
        startActivity(new Intent(HomePage.this, FootWear.class));

    }
    public  void Jackets(){
        startActivity(new Intent(HomePage.this, Jackets.class));

    }
    public  void openGlasses(){
        startActivity(new Intent(HomePage.this, Glasses.class));

    }
    public void openShop(){
        startActivity(new Intent(HomePage.this, shop.class));

    }


}