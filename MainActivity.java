package sg.edu.np.WhackAMole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button ButtonLeft;
    private Button ButtonMiddle;
    private Button ButtonRight;
    private static final String TAG = "Whack-A-Mole";

    /* Hint
        - The function setNewMole() uses the Random class to generate a random value ranged from 0 to 2.
        - Feel free to modify the function to suit your program.
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ButtonLeft = (Button) findViewById(R.id.ButtonLeft);
        ButtonMiddle = (Button) findViewById(R.id.ButtonMiddle);
        ButtonRight = (Button) findViewById(R.id.ButtonRight);

        Log.v(TAG, "Finished Pre-Initialisation!");
    }

    @Override
    protected void onStart(){
        super.onStart();
        setNewMole();
        Log.v(TAG, "Starting GUI!");
    }


    public void setNewMole()
    {
        Random ran = new Random();
        int randomLocation = ran.nextInt(3);
        ButtonLeft.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Log.v(TAG, "Button 1 is clicked!");
            }
        });

        ButtonMiddle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Log.v(TAG, "Button Middle Clicked!");
                Log.v(TAG, "Missed point deducted!");
            }
        });

        ButtonRight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Log.v(TAG, "Button Right Clicked!");
                Log.v(TAG, "Hit, score added!");
            }
        });
    }
    }
}
