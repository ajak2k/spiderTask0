package com.example.user.counter;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int one=0,two=0,five=0,ten=0;
int tot=0;
int amt;


    Button submit;
    ConstraintLayout l1;
    TextView totalAmt;
    TextView dues;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalAmt =findViewById(R.id.total);
        dues =findViewById(R.id.due);

        submit=findViewById(R.id.submit);
        l1=findViewById(R.id.lay);
    }

    public void generate_random(View view)
    {
        amt = new Random().nextInt(100 - 1) + 1;
        //TextView dues=findViewById(R.id.due);
        dues.setText("Amount Due : Rs."+ amt);
    }

    public void add1(View view) {
        one++;
        tot=one+two+five+ten;
       // TextView totalAmt=findViewById(R.id.total);
        totalAmt.setText("Total : Rs."+ tot);

    }

    public void add2(View view) {
        two+=2;
        tot=one+two+five+ten;
       // TextView totalAmt=findViewById(R.id.total);
        totalAmt.setText("Total : Rs."+ tot);

    }

    public void add5(View view) {
        five+=5;
        tot=one+two+five+ten;
      //  TextView totalAmt=findViewById(R.id.total);
        totalAmt.setText("Total : Rs."+ tot);

    }

    public void add10(View view) {
        ten+=10;
        tot=one+two+five+ten;
       // TextView totalAmt=findViewById(R.id.total);
        totalAmt.setText("Total : Rs."+ tot);


    }

    public void reset(View view) {
        tot=0;
        one=0;
        two=0;
        five=0;
        ten=0;

        totalAmt.setText("Total : Rs.0");

        l1.setBackgroundColor(Color.BLACK);


    }

    public void check(View view) {
        if(amt==tot)
            l1.setBackgroundColor(Color.GREEN);
        else
            l1.setBackgroundColor(Color.RED);



    }
}
