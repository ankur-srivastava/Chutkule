package com.edocent.chutkule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.Jokes;

public class MainActivity extends AppCompatActivity {

    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jokeText = (TextView) findViewById(R.id.jokeTextId);
        Jokes jokes = new Jokes();
        jokeText.setText(jokes.getJoke());
    }
}
