package com.example.ex3_mult;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tv;
    TextView multiplier , multiplicand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        int  multiplierInt  = Integer.parseInt(getIntent().getStringExtra("multiplier"));
        int multiplicandInt  = Integer.parseInt(getIntent().getStringExtra("multiplicand"));

        tv = (TextView) findViewById(R.id.textView);
        addIterative(multiplierInt, multiplicandInt);

    }
    public void addIterative(int multiplier, int multiplicand) {
        int answer = 0;
        tv.setText("-------------------------\n");
        tv.append("A" + "         "+ "B" + "\n");
        tv.append("-------------------------\n");
        while (multiplier > 0) {
            if ((multiplier % 2) == 1)
                answer = answer + multiplicand;

            tv.append( multiplicand + "               " + multiplier + "\n");
            multiplier = multiplier / 2;
            multiplicand = multiplicand * 2;

            // tv.setText("\n\n\n" + multiplier + "   " + multiplicand);
        }
        tv.append("-------------------------\n");
        tv.append( "Result : " + answer);


    }
}