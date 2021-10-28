package com.example.toastposition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowToast = findViewById(R.id.btnShowToast);
        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast top = Toast.makeText(MainActivity.this, "TOP", Toast.LENGTH_LONG);
                top.setGravity(Gravity.TOP, 0, 0);
                top.show();

                Toast center = Toast.makeText(MainActivity.this, "CENTER", Toast.LENGTH_LONG);
                center.setGravity(Gravity.CENTER, 0, 0);
                center.show();

                Toast bottom = Toast.makeText(MainActivity.this, "BOTTOM", Toast.LENGTH_LONG);
                bottom.setGravity(Gravity.BOTTOM, 0, 0);
                bottom.show();
            }
        });
    }
}