package com.example.user.wordcountthursdaylab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Map;

/**
 * Created by user on 13/12/2016.
 */

public class SentenceActivity extends AppCompatActivity {
    TextView userInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Count Sentence", "SentenceActivity.onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);

        userInputText = (TextView) findViewById(R.id.user_input_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String number = extras.getString("number of words");
//        String number_as_string = String.format("" + number);
        userInputText.setText(number);
    }
}
