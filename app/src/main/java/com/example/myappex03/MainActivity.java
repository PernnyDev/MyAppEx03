package com.example.myappex03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    private List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        bookList = new ArrayList<>();
        bookList.add(new Book(R.drawable.book1, getString(R.string.book1_title), getString(R.string.book1_summary)));
        bookList.add(new Book(R.drawable.book2, getString(R.string.book2_title), getString(R.string.book2_summary)));
        bookList.add(new Book(R.drawable.book3, getString(R.string.book3_title), getString(R.string.book3_summary)));

        bookAdapter = new BookAdapter(bookList, this::onBookClick);
        recyclerView.setAdapter(bookAdapter);
    }

    private void onBookClick(Book book) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("bookImage", book.getImageResId());
        intent.putExtra("bookTitle", book.getTitle());
        intent.putExtra("bookSummary", book.getSummary());
        startActivity(intent);
    }
}
