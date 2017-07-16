package com.scorecounter.ahsan.scorecounter;

import android.content.Intent;
import android.support.v4.hardware.display.DisplayManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class First_Page extends AppCompatActivity {


    public void StartMatch(View view){

        EditText Et1 = (EditText) findViewById(R.id.Player1);
        EditText Et2 = (EditText) findViewById(R.id.Player2);
        String PlayerA =Et1.getText().toString().trim();
        String PlayerB =Et2.getText().toString().trim();

        if(PlayerA .length()!=0&&PlayerB.length()!=0){
            Intent NextActivity = new Intent(this, MainActivity.class);
            NextActivity.putExtra("Team1",PlayerA);
            NextActivity.putExtra("Team2",PlayerB);
            startActivity(NextActivity);
        }
        else {
            Toast.makeText(this, "Cannot Continue Without Player's Name" , Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__page);
        EditText Et1 = (EditText) findViewById(R.id.Player1);
        EditText Et2 = (EditText) findViewById(R.id.Player2);
        Et1.setText("");
        Et2.setText("");
    }
}
