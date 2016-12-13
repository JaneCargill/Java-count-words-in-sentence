package com.example.user.wordcountthursdaylab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText sentenceEditText;
    Button userInput;
    Sentence sentence;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        sentenceEditText = (EditText) findViewById(R.id.sentence_text);

        userInput = (Button) findViewById(R.id.count_words);

        userInput.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String text = sentenceEditText.getText().toString();
                sentence = new Sentence(text);
                int wordNumber = sentence.countWords();

                Intent intent = new Intent(MainActivity.this, SentenceActivity.class);

                intent.putExtra("number of words", wordNumber);
//                Integer asInt = (Integer) wordNumber;
//                Log.d("wordNumber =", asInt.toString());

                startActivity(intent);
            }


        });
    }
}
