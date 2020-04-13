package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;
        rollButton=(Button) findViewById(R.id.rollButton);

        final ImageView leftdice=(ImageView) findViewById(R.id.image_leftdice);

        final ImageView rightdice=(ImageView) findViewById(R.id.image_rightdice);
        final int[] diceArray={
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
                    R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6


        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","The button is pressed");
                Random randomNumberGenerator= new Random();
                int number= randomNumberGenerator.nextInt(6);
                Log.d("Dicee","The random number is" + number);
                leftdice.setImageResource(diceArray[number]);

                int integer= randomNumberGenerator.nextInt(6);
                Log.d("Dicee","The random number is" + integer);
                rightdice.setImageResource(diceArray[integer]);
            }
        });

    }
}
