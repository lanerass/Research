package com.example.lane.research;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numbers, android.R.layout.simple_spinner_item);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinner.setAdapter(adapter);


        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button mult = (Button) findViewById(R.id.mult);
        Button div = (Button) findViewById(R.id.div);
        add.setOnClickListener(new OnClickListener() {//when user clicks calulate button
                                   @Override
                                   public void onClick(View view) {
                                       EditText num1 = (EditText) findViewById(R.id.num1);//finds each number from xml
                                       EditText num2 = (EditText) findViewById(R.id.num2);
                                       TextView result = (TextView) findViewById(R.id.result);

                                       int number1 = Integer.parseInt(num1.getText().toString());//converts values inputted to integers
                                       int number2 = Integer.parseInt(num2.getText().toString());
                                       int resultvalue = number1 + number2;
                                       result.setText(resultvalue + "");//returns result of two numbers added

                                   }

                               }
        );
        sub.setOnClickListener(new OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       EditText num1 = (EditText) findViewById(R.id.num1);
                                       EditText num2 = (EditText) findViewById(R.id.num2);
                                       TextView result = (TextView) findViewById(R.id.result);

                                       int number1 = Integer.parseInt(num1.getText().toString());
                                       int number2 = Integer.parseInt(num2.getText().toString());
                                       int resultvalue = number1 - number2;
                                       result.setText(resultvalue + "");

                                   }

                               }
        );
        mult.setOnClickListener(new OnClickListener() {//when user clicks calulate button
                                    @Override
                                    public void onClick(View view) {
                                        EditText num1 = (EditText) findViewById(R.id.num1);
                                        EditText num2 = (EditText) findViewById(R.id.num2);
                                        TextView result = (TextView) findViewById(R.id.result);

                                        int number1 = Integer.parseInt(num1.getText().toString());
                                        int number2 = Integer.parseInt(num2.getText().toString());
                                        int resultvalue = number1 * number2;
                                        result.setText(resultvalue + "");

                                    }

                                }
        );
        div.setOnClickListener(new OnClickListener() {
                                   @Override
                                   public void onClick(View view) {
                                       EditText num1 = (EditText) findViewById(R.id.num1);
                                       EditText num2 = (EditText) findViewById(R.id.num2);
                                       TextView result = (TextView) findViewById(R.id.result);

                                       double number1 = Integer.parseInt(num1.getText().toString());
                                       double number2 = Integer.parseInt(num2.getText().toString());
                                       double resultvalue = number1 / number2;
                                       result.setText(resultvalue + "");

                                   }

                               }
        );
    }

}
