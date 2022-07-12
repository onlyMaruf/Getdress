package com.myfirst.fashionbae.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.myfirst.fashionbae.R;

public class MainActivity extends AppCompatActivity {
    Button login,signin,onBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        login=findViewById(R.id.button1);
        signin=findViewById(R.id.button2);
        ImageView backbutton = findViewById(R.id.backbutton);
        backbutton.setOnClickListener(view -> {
            moveback(view);
        } );
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SignInActivity.class));
            }
        });


    }
    public void moveback(View view){
        startActivity(new Intent(MainActivity.this, com.myfirst.fashionbae.activities.OnBoardActivity.class));
    }

}