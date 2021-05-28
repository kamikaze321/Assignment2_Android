package com.example.easyfix;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GriditemActivity extends AppCompatActivity {
    TextView name;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);

        name=findViewById(R.id.textViewGridName);
        image=findViewById(R.id.imageViewData);

        Intent intent=getIntent();
        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("image",0));
    }
}
