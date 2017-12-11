package ec327.gdevlin.ec327final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        init4();
        init5();
        init6();
    }

    public Button rock_button;
    public Button paper_button;
    public Button scissors_button;

    public void init4() {
        rock_button = (Button) findViewById(R.id.rock_button);
        rock_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy4 = new Intent(Activity2.this, rpsbackend.class);
                toy4.putExtra("input", 1);
                startActivity(toy4);
            }

        });
    }

    public void init5() {
        paper_button = (Button) findViewById(R.id.paper_button);
        paper_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy5 = new Intent(Activity2.this, rpsbackend.class);
                toy5.putExtra("input", 2);
                startActivity(toy5);
            }

        });
    }

    public void init6() {
        scissors_button = (Button) findViewById(R.id.scissors_button);
        scissors_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy6 = new Intent(Activity2.this, rpsbackend.class);
                toy6.putExtra("input" , 3);
                startActivity(toy6);
            }

        });
    }
}



