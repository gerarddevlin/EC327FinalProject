package ec327.gdevlin.ec327final;
//package com.example.chris.buttons;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.ViewDebug;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import org.w3c.dom.Text;

        import java.util.Scanner;

        import static android.widget.Toast.LENGTH_LONG;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        btn1();
        btn2();
        btn3();
        btn4();
        btn5();
        btn6();
        btn7();
        btn8();
        btn9();
        init9();
        init10();
    }

    public int count = 0;

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;

    public TextView text1;
    public TextView text2;
    public TextView text3;
    public TextView text4;
    public TextView text5;
    public TextView text6;
    public TextView text7;
    public TextView text8;
    public TextView text9;

    //public TextView decision;
    public TextView Player;
    //public TextView tie;

    public boolean save1;
    public boolean save2;
    public boolean save3;
    public boolean save4;
    public boolean save5;
    public boolean save6;
    public boolean save7;
    public boolean save8;
    public boolean save9;
    public boolean save11;
    public boolean save12;
    public boolean save13;
    public boolean save14;
    public boolean save15;
    public boolean save16;
    public boolean save17;
    public boolean save18;
    public boolean save19;


    public int player = 1;

    public void btn1(){
        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View b = findViewById(R.id.button1);
                b.setVisibility(View.GONE);
                TextView t1 = findViewById(R.id.text1);
                TextView p = findViewById(R.id.Player);
                if (player == 1) {
                    t1.setText("X");
                    count++;
                    save1 = true;
                    if((player == 1) && ((save1 && save2 && save3) || (save4 && save5 && save6) || (save7 && save8 && save9) || (save1 && save4 && save7) ||(save2 && save5 && save8) || (save3 && save6 && save9) || (save1 && save5 && save9) || (save3 && save5 && save7)))
                    {
                        //Intent intent = new Intent(this, )
                        //TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 1 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);

                        //d1.setText("Player 1 Wins!");
                    }

                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }

                    else {
                        p.setText("Player 2's Turn");
                        player = 2;
                    }
                } else {

                    t1.setText("O");
                    count++;
                    save11 = true;
                    if((player == 2) && ((save11 && save12 && save13) ||(save14 && save15 && save16) || (save17 && save18 && save19) || (save11 && save14 && save17) ||(save12 && save15 && save18) || (save13 && save16 && save19) || (save11 && save15 && save19) || (save13 && save15 && save17)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 2 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                    }
                    else if(count == 9)
                    {
                        //TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 1's Turn");
                        player = 1;
                    }
                }
            }
        });
    }

    public void btn2(){
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View b = findViewById(R.id.button2);
                b.setVisibility(View.GONE);
                TextView t1 = findViewById(R.id.text2);
                TextView p = findViewById(R.id.Player);
                if (player == 1) {
                    count++;
                    t1.setText("X");
                    save2 = true;
                    if((player == 1) && ((save1 && save2 && save3) ||(save4 && save5 && save6) || (save7 && save8 && save9) || (save1 && save4 && save7) ||(save2 && save5 && save8) || (save3 && save6 && save9) || (save1 && save5 && save9) || (save3 && save5 && save7)))
                    {
                        //TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 1 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 1 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 2's Turn");
                        player = 2;
                    }
                } else {

                    t1.setText("O");
                    count++;
                    save12 = true;
                    if((player == 2) && ((save11 && save12 && save13) ||(save14 && save15 && save16) || (save17 && save18 && save19) || (save11 && save14 && save17) ||(save12 && save15 && save18) || (save13 && save16 && save19) || (save11 && save15 && save19) || (save13 && save15 && save17)))
                    {
                        //TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 2 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 2 Wins!");
                    }
                    else if(count == 9)
                    {
                        //TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 1's Turn");
                        player = 1;
                    }
                }
            }
        });
    }
    public void btn3(){
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View b = findViewById(R.id.button3);
                b.setVisibility(View.GONE);
                TextView t1 = findViewById(R.id.text3);
                TextView p = findViewById(R.id.Player);
                if (player == 1) {
                    count++;
                    t1.setText("X");
                    save3 = true;
                    if((player == 1) && ((save1 && save2 && save3) ||(save4 && save5 && save6) || (save7 && save8 && save9) || (save1 && save4 && save7) ||(save2 && save5 && save8) || (save3 && save6 && save9) || (save1 && save5 && save9) || (save3 && save5 && save7)))
                    {
                        //TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 1 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 1 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 2's Turn");
                        player = 2;
                    }
                } else {
                    count++;
                    t1.setText("O");
                    save13 = true;
                    if((player == 2) && ((save11 && save12 && save13) ||(save14 && save15 && save16) || (save17 && save18 && save19) || (save11 && save14 && save17) ||(save12 && save15 && save18) || (save13 && save16 && save19) || (save11 && save15 && save19) || (save13 && save15 && save17)))
                    {
                        //TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 2 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 2 Wins!");
                    }
                    else if(count == 9)
                    {
                        //TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 1's Turn");
                        player = 1;
                    }
                }
            }
        });
    }
    public void btn4(){
        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View b = findViewById(R.id.button4);
                b.setVisibility(View.GONE);
                TextView t1 = findViewById(R.id.text4);
                TextView p = findViewById(R.id.Player);
                if (player == 1) {
                    count++;
                    t1.setText("X");
                    save4 = true;
                    if((player == 1) && ((save1 && save2 && save3) ||(save4 && save5 && save6) || (save7 && save8 && save9) || (save1 && save4 && save7) ||(save2 && save5 && save8) || (save3 && save6 && save9) || (save1 && save5 && save9) || (save3 && save5 && save7)))
                    {
                        //TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 1 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 1 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 2's Turn");
                        player = 2;
                    }
                } else {
                    count++;
                    t1.setText("O");
                    save14 = true;
                    if((player == 2) && ((save11 && save12 && save13) ||(save14 && save15 && save16) || (save17 && save18 && save19) || (save11 && save14 && save17) ||(save12 && save15 && save18) || (save13 && save16 && save19) || (save11 && save15 && save19) || (save13 && save15 && save17)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 2 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 2 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 1's Turn");
                        player = 1;
                    }
                }
            }
        });
    }
    public void btn5(){
        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View b = findViewById(R.id.button5);
                b.setVisibility(View.GONE);
                TextView t1 = findViewById(R.id.text5);
                TextView p = findViewById(R.id.Player);
                if (player == 1) {
                    count++;
                    t1.setText("X");
                    save5 = true;
                    if((player == 1) && ((save1 && save2 && save3) ||(save4 && save5 && save6) || (save7 && save8 && save9) || (save1 && save4 && save7) ||(save2 && save5 && save8) || (save3 && save6 && save9) || (save1 && save5 && save9) || (save3 && save5 && save7)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 1 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 1 Wins!");
                    }
                    else if(count == 9)
                    {
                        //TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 2's Turn");
                        player = 2;
                    }
                } else {
                    count++;
                    t1.setText("O");
                    save15 = true;
                    if((player == 2) && ((save11 && save12 && save13) ||(save14 && save15 && save16) || (save17 && save18 && save19) || (save11 && save14 && save17) ||(save12 && save15 && save18) || (save13 && save16 && save19) || (save11 && save15 && save19) || (save13 && save15 && save17)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 2 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 2 Wins!");
                    }
                    else if(count == 9)
                    {
                        //TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 1's Turn");
                        player = 1;
                    }
                }
            }
        });
    }
    public void btn6(){
        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View b = findViewById(R.id.button6);
                b.setVisibility(View.GONE);
                TextView t1 = findViewById(R.id.text6);
                TextView p = findViewById(R.id.Player);
                if (player == 1) {
                    count++;
                    t1.setText("X");
                    save6 = true;
                    if((player == 1) && ((save1 && save2 && save3) ||(save4 && save5 && save6) || (save7 && save8 && save9) || (save1 && save4 && save7) ||(save2 && save5 && save8) || (save3 && save6 && save9) || (save1 && save5 && save9) || (save3 && save5 && save7)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 1 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 1 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 2's Turn");
                        player = 2;
                    }
                } else {
                    count++;
                    t1.setText("O");
                    save16 = true;
                    if((player == 2) && ((save11 && save12 && save13) ||(save14 && save15 && save16) || (save17 && save18 && save19) || (save11 && save14 && save17) ||(save12 && save15 && save18) || (save13 && save16 && save19) || (save11 && save15 && save19) || (save13 && save15 && save17)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 2 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 2 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        //t2.setText("Tie!");
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                    }
                    else {
                        p.setText("Player 1's Turn");
                        player = 1;
                    }
                }
            }
        });
    }
    public void btn7(){
        button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View b = findViewById(R.id.button7);
                b.setVisibility(View.GONE);
                TextView t1 = findViewById(R.id.text7);
                TextView p = findViewById(R.id.Player);
                if (player == 1) {
                    count++;
                    t1.setText("X");
                    save7 = true;
                    if((player == 1) && ((save1 && save2 && save3) ||(save4 && save5 && save6) || (save7 && save8 && save9) || (save1 && save4 && save7) ||(save2 && save5 && save8) || (save3 && save6 && save9) || (save1 && save5 && save9) || (save3 && save5 && save7)))
                    {
                      //  TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 1 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 1 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //t2.setText("Tie!");
                    }
                    else {
                        p.setText("Player 2's Turn");
                        player = 2;
                    }
                } else {
                    count++;
                    t1.setText("O");
                    save17 = true;
                    if((player == 2) && ((save11 && save12 && save13) ||(save14 && save15 && save16) || (save17 && save18 && save19) || (save11 && save14 && save17) ||(save12 && save15 && save18) || (save13 && save16 && save19) || (save11 && save15 && save19) || (save13 && save15 && save17)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 2 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 2 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                    }
                    else {
                        p.setText("Player 1's Turn");
                        player = 1;
                    }
                }
            }
        });
    }
    public void btn8(){
        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View b = findViewById(R.id.button8);
                b.setVisibility(View.GONE);
                TextView t1 = findViewById(R.id.text8);
                TextView p = findViewById(R.id.Player);
                if (player == 1) {
                    count++;
                    t1.setText("X");
                    save8 = true;
                    if((player == 1) && ((save1 && save2 && save3) ||(save4 && save5 && save6) || (save7 && save8 && save9) || (save1 && save4 && save7) ||(save2 && save5 && save8) || (save3 && save6 && save9) || (save1 && save5 && save9) || (save3 && save5 && save7)))
                    {
                      //  TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 1 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 1 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                    }
                    else {
                        p.setText("Player 2's Turn");
                        player = 2;
                    }
                } else {
                    count++;
                    t1.setText("O");
                    save18 = true;
                    if((player == 2) && ((save11 && save12 && save13) ||(save14 && save15 && save16) || (save17 && save18 && save19) || (save11 && save14 && save17) ||(save12 && save15 && save18) || (save13 && save16 && save19) || (save11 && save15 && save19) || (save13 && save15 && save17)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 2 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 2 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                    }
                    else {
                        p.setText("Player 1's Turn");
                        player = 1;
                    }
                }
            }
        });
    }
    public void btn9(){
        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View b = findViewById(R.id.button9);
                b.setVisibility(View.GONE);
                TextView t1 = findViewById(R.id.text9);
                TextView p = findViewById(R.id.Player);
                if (player == 1) {
                    count++;
                    t1.setText("X");
                    save9 = true;
                    if((player == 1) && ((save1 && save2 && save3) ||(save4 && save5 && save6) || (save7 && save8 && save9) || (save1 && save4 && save7) ||(save2 && save5 && save8) || (save3 && save6 && save9) || (save1 && save5 && save9) || (save3 && save5 && save7)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 1 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 1 Wins!");
                    }
                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                    }
                    else {
                        p.setText("Player 2's Turn");
                        player = 2;
                    }
                } else {
                    count++;
                    t1.setText("O");
                    save19 = true;
                    if((player == 2) && ((save11 && save12 && save13) ||(save14 && save15 && save16) || (save17 && save18 && save19) || (save11 && save14 && save17) ||(save12 && save15 && save18) || (save13 && save16 && save19) || (save11 && save15 && save19) || (save13 && save15 && save17)))
                    {
                       // TextView d1 = findViewById(R.id.decision);
                        button1.setVisibility(View.INVISIBLE);
                        button2.setVisibility(View.INVISIBLE);
                        button3.setVisibility(View.INVISIBLE);
                        button4.setVisibility(View.INVISIBLE);
                        button5.setVisibility(View.INVISIBLE);
                        button6.setVisibility(View.INVISIBLE);
                        button7.setVisibility(View.INVISIBLE);
                        button8.setVisibility(View.INVISIBLE);
                        button9.setVisibility(View.INVISIBLE);
                        Toast.makeText(Activity1.this, "Player 2 Wins!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                        //d1.setText("Player 2 Wins!");
                    }

                    else if(count == 9)
                    {
                       // TextView t2 = findViewById(R.id.tie);
                        Toast.makeText(Activity1.this, "Tie!", LENGTH_LONG).show();
                        play_again.setVisibility(View.VISIBLE);
                        home.setVisibility(View.VISIBLE);
                    }
                    else {
                        p.setText("Player 1's Turn");
                        player = 1;
                    }
                }
            }
        });
    }

    public Button play_again;
    public Button home;

    public void init9() {
        play_again = (Button) findViewById(R.id.play_again);
        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(Activity1.this, Activity1.class);

                startActivity(myintent);
            }
        });
    }

    public void init10() {
        home = (Button) findViewById(R.id.home_button);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(Activity1.this, Home_screen.class);

                startActivity(myintent);
            }
        });
    }

}
