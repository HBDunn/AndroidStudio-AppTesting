package com.vgrec.espressoexamples.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.vgrec.espressoexamples.R;


public class DisplayNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_name);

        String text = getIntent().getStringExtra(EnterNameActivity.NAME);
        TextView greetingTextView = (TextView) findViewById(R.id.greeting_message);
        greetingTextView.setText("Hello " + text + "!");
    }
}