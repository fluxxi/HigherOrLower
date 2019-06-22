package de.flxi.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    EditText editText;
    int randomNumber;

    public void generateRandomNumber() {

        Random random = new Random();

        randomNumber = random.nextInt(20) +1;

    }


    public void guess(View t) {

        Log.i("Button geklickt", "Hat Funktioniert");

        //generateRandomNumber();
        //Log.i("Zufallswert ist", Integer.toString(randomNumber));

        int guessValue = Integer.parseInt(editText.getText().toString());

        Log.i("Zufälliger Wert:", Integer.toString(randomNumber));

        String message;

        if(guessValue > randomNumber) {

            message = "Niedriger!";

        }else if (guessValue < randomNumber) {

            message = "Höher";

        }else {

            message = "Richtig! Spiele nochmal";
            generateRandomNumber();
        }


        Toast.makeText(this, message , Toast.LENGTH_SHORT).show();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        generateRandomNumber();


    }
}
