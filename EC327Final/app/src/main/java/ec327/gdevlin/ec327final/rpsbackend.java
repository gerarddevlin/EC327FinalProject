package ec327.gdevlin.ec327final;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class rpsbackend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpsbackend);
        Intent mIntent = getIntent();
        int input = mIntent.getIntExtra("input", 0);
        check(input);
        init7();
        init8();
    }

    static int user = 0;
    static int comp = 0;
    static int tie = 0;

    @SuppressLint("SetTextI18n")
    public void check(int input) {
        Random random = new Random();

        int rock = 1, paper = 2, scissors = 3;
        int rand = random.nextInt(3 - 1 + 1) + 1;

        if (rand == rock) {
            if (input == rock) {
                tie = tie +1;
                TextView textView = findViewById(R.id.textView6);
                textView.setText("Computer chose Rock: \n It's a tie!\n\n The Score is: \n Me: "+user+"\nComputer: "+comp+"\nTies: "+tie);
            } else if (input == paper) {
                user = user + 1;
                TextView textView = findViewById(R.id.textView6);
                textView.setText("Computer chose Rock:  \n You Win!\n\n The Score is: \n  Me: "+user+"\nComputer: "+comp+"\nTies: "+tie);
            } else if (input == scissors) {
                comp = comp + 1;
                TextView textView = findViewById(R.id.textView6);
                textView.setText("Computer chose Rock: \n You Lose! \n\n The Score is: \n Me: "+user+"\nComputer: "+comp+"\nTies: "+tie);
            }
        } else if (rand == paper) {
            if (input == rock) {
                comp = comp + 1;
                TextView textView = findViewById(R.id.textView6);
                textView.setText("Computer chose Paper: \n You Lose! \n\n The Score is: \n Me: "+user+"\nComputer: "+comp+"\nTies: "+tie);

            } else if (input == scissors) {
                user = user + 1;
                TextView textView = findViewById(R.id.textView6);
                textView.setText("Computer chose Paper: \n  You Win! \n\n The Score is: \n Me: "+user+"\nComputer: "+comp+"\nTies: "+tie);


            } else if (input == paper) {
                tie = tie + 1;
                TextView textView = findViewById(R.id.textView6);
                textView.setText("Computer chose Paper: \n It's a tie!\n\n The Score is: \n Me: "+user+"\nComputer: "+comp+"\nTies: "+tie);

            }
        } else if (rand == scissors) {
            if (input == paper) {
                comp = comp + 1;
                TextView textView = findViewById(R.id.textView6);
                textView.setText("Computer chose Scissors: \n You Lose!\n\n The Score is: \n Me: "+user+"\nComputer: "+comp+"\nTies: "+tie);


            } else if (input == rock) {
                user = user + 1;
                TextView textView = findViewById(R.id.textView6);
                textView.setText("Computer chose Scissors: \n You Win!\n\n The Score is: \n Me: "+user+"\nComputer: "+comp+"\nTies: "+tie);
            } else if (input == scissors) {
                tie = tie + 1;
                TextView textView = findViewById(R.id.textView6);
                textView.setText("Computer chose Scissors: \n It's a tie!\n\n The Score is: \n Me: " + user + "\nComputer: " + comp + "\nTies: " + tie);
            }


        }


    }

    public Button play_again;
    public Button home;

    public void init7() {
        play_again = (Button) findViewById(R.id.play_again);
        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(rpsbackend.this, Activity2.class);

                startActivity(myintent);
            }
        });
    }

    public void init8() {
        home = (Button) findViewById(R.id.Home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(rpsbackend.this, Home_screen.class);

                startActivity(myintent);
            }
        });
    }

}











