package ec327.gdevlin.ec327final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

    import android.app.usage.UsageEvents;
        import android.content.Context;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Handler;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.MotionEvent;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

import ec327.gdevlin.ec327final.View.Snake_View;
import ec327.gdevlin.ec327final.engine.Game_Engine;
import ec327.gdevlin.ec327final.enums.Direction;
import ec327.gdevlin.ec327final.enums.Game_State;


public class Activity3 extends AppCompatActivity implements View.OnTouchListener {

    private Game_Engine game_engine;
    private Snake_View snake_view;
    private final Handler handler = new Handler();
    private final long updateDelay = 185;               //delay for update -> speed
    private float last_X, last_Y;
    private int Score = Game_Engine.Score;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        game_engine = new Game_Engine();
        game_engine.inGame();
        snake_view = (Snake_View) findViewById(R.id.Snake_View);
        snake_view.setOnTouchListener(this);

        startUpdateHandler();
    }


    private void startUpdateHandler() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                game_engine.Update();
                if (game_engine.getCurrentGame_State() == Game_State.Running) {
                    handler.postDelayed(this, updateDelay);
                }
                if (game_engine.getCurrentGame_State() == Game_State.Lost) {
                    LostGame();
                }
                snake_view.setSnakeViewMap(game_engine.getMap());
                snake_view.invalidate();
            }
        }, updateDelay);
    }

    public Button button1;
    public Button button2;

    /*  public void newGame(){
          button2 =(Button)findViewById(R.id.button2);
          button2.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View view){
                  Intent myintent = new Intent(packageContext: rpsbackend.this, Activity3.class)
                  startActivity(myintent);
              }
          });
      }
  */
    private void LostGame() {
        Intent intent = new Intent(getApplicationContext(), highscore.class);
        intent.putExtra("Score", Game_Engine.Score);
        startActivity(intent);
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {      //touch controls
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:             //touched screen
                last_X = event.getX();
                last_Y = event.getY();
                break;
            case MotionEvent.ACTION_UP:             //finger up
                float newX = event.getX();
                float newY = event.getY();

                //calculate swipe
                if (Math.abs(newX - last_X) > Math.abs(newY - last_Y)) {
                    //swipe left or right
                    if (newX > last_X) {
                        //swipe to right
                        game_engine.UpdateDir(Direction.East);
                    } else {
                        //swipe to left
                        game_engine.UpdateDir(Direction.West);
                    }
                } else {
                    //up or down swipe
                    if (newY > last_Y) {
                        //swipe up
                        game_engine.UpdateDir(Direction.South);
                    } else {
                        //swipe down
                        game_engine.UpdateDir(Direction.North);
                    }
                }
                break;
        }
        return true;
    }

    public int getScore() {
        return Score;
    }
}