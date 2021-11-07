package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Button button = (Button)view;
        String colorHex = (String)button.getTag();
        String text = (String)button.getText();
        Drawable image = getResources().getDrawable(R.drawable.circle);
        image.setColorFilter(Color.parseColor(colorHex), PorterDuff.Mode.SRC_ATOP);
        findViewById(R.id.circle).setBackground(image);
        ((TextView)findViewById(R.id.color)).setText(text);
    }
}