package com.scorecounter.ahsan.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int ScoreA,ScoreB = 0;
    String Name1;
    String Name2;
    int Num = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name1 = getIntent().getStringExtra("Team1");
        Name2 = getIntent().getStringExtra("Team2");
        TextView Player1 = (TextView) findViewById(R.id.NameTeamA);
        Player1.setText(""+Name1);
        TextView Player2 = (TextView) findViewById(R.id.NameTeamB);
        Player2.setText(""+Name2);
    }

    public void GameEqual(){
        if(ScoreA==20&&ScoreB==20){
            ScoreA = ScoreA-Num;
            ScoreB = ScoreB-Num;
            Num--;
            TextView textViewA = (TextView) findViewById(R.id.ScoreNumberA);
            textViewA.setText(""+ScoreA);
            TextView textViewB = (TextView) findViewById(R.id.ScoreNumberB);
            textViewB.setText(""+ScoreB);
        }
    }

    public void ScoreUpA(View view){
        TextView textView = (TextView) findViewById(R.id.ScoreNumberA);
        ScoreA++;
        GameEqual();
        if(ScoreA>20){
            Toast.makeText(MainActivity.this,"Winner of the Game " +Name1,Toast.LENGTH_LONG).show();
            finish();
        }
        else {
            textView.setText("" + ScoreA);
        }
    }
    public void ScoreUpB(View view){
        TextView textView = (TextView) findViewById(R.id.ScoreNumberB);
        ScoreB++;
        GameEqual();
        if(ScoreB>20){
            Toast.makeText(MainActivity.this,"Winner of the Game "+Name2,Toast.LENGTH_LONG).show();
            finish();
        }
        else {
            textView.setText("" + ScoreB);
        }
    }
    public void Reset(View view){
        TextView textView1 = (TextView) findViewById(R.id.ScoreNumberA);
        ScoreA = 0;
        textView1.setText(""+ScoreA);

        TextView textView2 = (TextView) findViewById(R.id.ScoreNumberB);
        ScoreB = 0;
        textView2.setText(""+ScoreA);
    }
}
