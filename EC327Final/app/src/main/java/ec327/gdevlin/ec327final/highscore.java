package ec327.gdevlin.ec327final;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ec327.gdevlin.ec327final.engine.Game_Engine;

public class highscore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);

        init8();

        TextView ScoreLab = (TextView) findViewById(R.id.ScoreLab);
        TextView highLab = (TextView) findViewById(R.id.highLab);

        int Score = getIntent().getIntExtra("Score", 0);
        ScoreLab.setText(Score + "");

        SharedPreferences settings = getSharedPreferences("GAME_DATA", MODE_PRIVATE);
        int highScore = settings.getInt("HIGH_SCORE", 0);

        if (Score > highScore) {            //stores new high score if current score greater than old high score
            highLab.setText("High Score: " + Game_Engine.Score);
            SharedPreferences.Editor editor = settings.edit();
            editor.putInt("HIGH_SCORE", Game_Engine.Score);
            editor.commit();
        } else {
            highLab.setText("High Score: " + highScore);
        }
    }

    public void newGame(View view) {            //new game
        Game_Engine.Score = 0;                  //resets score to 0
        startActivity(new Intent(getApplicationContext(), Activity3.class));
    }

    public Button home;         //button to home screen
    public void init8() {
        home = (Button) findViewById(R.id.home1);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(highscore.this, Home_screen.class);

                startActivity(myintent);
            }
        });
    }
}

