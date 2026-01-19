package com.example.ex0607;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn;
    private ImageView iVmain;
    double x;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iVmain = findViewById(R.id.iVmain);

    }

    public void clicked(View view) {
        x = (int)(Math.random()*4 +1);
        if(x==1){
            btn.setImageResource(R.drawable.num1);
            iVmain.setImageResource(R.drawable.dog1);
        } else if (x==2) {
            btn.setImageResource(R.drawable.num2);
            iVmain.setImageResource(R.drawable.dog2);
        }
        else{
            btn.setImageResource(R.drawable.num3);
            iVmain.setImageResource(R.drawable.dog3);
        }
    }
}