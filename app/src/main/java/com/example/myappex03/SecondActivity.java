package com.example.myappex03;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView header = findViewById(R.id.header);
        ImageView bookImage = findViewById(R.id.bookImage);
        TextView bookSummary = findViewById(R.id.bookSummary);

        int imageResId = getIntent().getIntExtra("bookImage", 0);
        String title = getIntent().getStringExtra("bookTitle");
        String summary = getIntent().getStringExtra("bookSummary");

        header.setText(title);
        bookImage.setImageResource(imageResId);
        bookSummary.setText(summary);
    }
}
