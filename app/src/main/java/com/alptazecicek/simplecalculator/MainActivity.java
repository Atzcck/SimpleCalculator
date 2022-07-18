package com.alptazecicek.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textNumber1;
    EditText textNumber2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNumber1 = findViewById(R.id.textNumber1);
        textNumber2 = findViewById(R.id.textNumber2);
        textResult = findViewById(R.id.textResult);


    }

    public void sum(View view) {

        if (textNumber1.getText().toString().matches("") || textNumber2.getText().toString().matches("")) {

            textResult.setText("Enter Number");

        } else {
            int number1 = Integer.parseInt(textNumber1.getText().toString());
            int number2 = Integer.parseInt(textNumber2.getText().toString());
            int result = number1 + number2;
            textResult.setText("Result :" + result);

        }

    }

    public void subst(View view) {
        if (textNumber1.getText().toString().matches("") || textNumber2.getText().toString().matches("")) {

            textResult.setText("Enter Number");

        } else {
            int number1 = Integer.parseInt(textNumber1.getText().toString());
            int number2 = Integer.parseInt(textNumber2.getText().toString());
            int result = number1 - number2;
            textResult.setText("Result :" + result);

        }

    }

    public void multiply(View view) {
        if (textNumber1.getText().toString().matches("") || textNumber2.getText().toString().matches("")) {

            textResult.setText("Enter Number");

        } else {
            int number1 = Integer.parseInt(textNumber1.getText().toString());
            int number2 = Integer.parseInt(textNumber2.getText().toString());
            int result = number1 * number2;
            textResult.setText("Result :" + result);

        }
    }

    public void divide(View view) {

        if (textNumber1.getText().toString().matches("") || textNumber2.getText().toString().matches("")) {

            textResult.setText("Enter Number");

        } else {
            int number1 = Integer.parseInt(textNumber1.getText().toString());
            int number2 = Integer.parseInt(textNumber2.getText().toString());
            int result = number1 / number2;
            textResult.setText("Result :" + result);

        }

    }

}