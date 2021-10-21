package com.example.ex3_mult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText multiplier = (EditText) findViewById(R.id.multiplier);
        EditText multiplicand = (EditText) findViewById(R.id.multiplicand);

        Button calculate = (Button) findViewById(R.id.calculateButton);
        Button clearScreen = (Button) findViewById(R.id.clearScreenButton);
        Button finishApp = (Button) findViewById(R.id.finishAppButton);



        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int multiplierInt = Integer.parseInt(multiplier.getText().toString());
                int multiplicandInt = Integer.parseInt(multiplicand.getText().toString());


                if (multiplier.getText().toString() != "" && multiplicand.getText().toString() != ""){
                    openActivity2(multiplier , multiplicand);
                }


            }
        });


        clearScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplier.setText("");
                multiplicand.setText("");
            }
        });


        finishApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory(Intent.CATEGORY_HOME);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });

    }
    public void openActivity2(EditText multiplier, EditText multiplicand){
        String multiplierS = multiplier.getText().toString();
        String multiplicandS = multiplicand.getText().toString();
        Intent intent = new Intent(this , Activity2.class);
        intent.putExtra("multiplier" , multiplierS);
        intent.putExtra("multiplicand" , multiplicandS);
        startActivity(intent);
        return;
    }
}