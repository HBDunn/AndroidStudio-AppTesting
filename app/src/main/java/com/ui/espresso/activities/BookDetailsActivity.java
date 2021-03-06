package com.ui.espresso.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.ui.espresso.R;


public class BookDetailsActivity extends AppCompatActivity {

    public static final String TITLE = "title";
    public static final String AUTHOR = "author";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        TextView bookTitle = (TextView) findViewById(R.id.book_title);
        TextView bookAuthor = (TextView) findViewById(R.id.book_author);

        bookTitle.setText(getIntent().getStringExtra(TITLE));
        bookAuthor.setText(getIntent().getStringExtra(AUTHOR));
    }
}
