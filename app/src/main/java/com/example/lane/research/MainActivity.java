package com.example.lane.research;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc= (Button) findViewById(R.id.calc);
        calc.setOnClickListener(new OnClickListener() {//when user clicks calulate button
            @Override
            public void onClick(View view) {
                EditText num1 = (EditText) findViewById(R.id.num1);//finds each number from xml
                EditText num2 = (EditText) findViewById(R.id.num2);
                TextView result= (TextView) findViewById(R.id.result);

                int number1= Integer.parseInt(num1.getText().toString());//converts values inputted to integers
                int number2= Integer.parseInt(num2.getText().toString());
                int resultvalue= number1*number2;
                result.setText(resultvalue+ "");//returns result of two numbers added

            }

    }
    );
    }
}
