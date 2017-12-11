package ec327.gdevlin.ec327final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home_screen extends AppCompatActivity {

    public Button Game2;
    public Button Game1;
    public Button Game3;

    public void init(){
        Game2 = (Button)findViewById(R.id.Game2);
        Game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(Home_screen.this,Activity2.class);

                startActivity(toy);
            }

        });

    }
    public void init2(){
        Game1 = (Button)findViewById(R.id.Game1);
        Game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(Home_screen.this,Activity1.class);

                startActivity(toy);
            }

        });

    }

    public void init3(){
        Game3 = (Button)findViewById(R.id.Game3);
        Game3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy = new Intent(Home_screen.this,Activity3.class);

                startActivity(toy);
            }

        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        init();
        init2();
        init3();
    }


}
