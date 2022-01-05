package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button home,contactUs,openCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home=findViewById(R.id.btn1);
        contactUs=findViewById(R.id.btn2);
        openCamera=findViewById(R.id.btn3);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i = new Intent(MainActivity.this, ContactUsActivity.class);
            startActivity(i);
            }
        });

        openCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,CameraActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart","started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy","started");
    }
}