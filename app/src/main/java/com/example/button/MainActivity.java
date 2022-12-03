package com.example.button;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtheight,txtweight;
    Button total;
    TextView txtBmi;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtheight=findViewById(R.id.txtheight);
        txtweight=findViewById(R.id.txtweight);
        total= findViewById(R.id.total);
        txtBmi=findViewById(R.id.txtbmi);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               float h = Float.parseFloat(txtheight.getText().toString());
                float w = Float.parseFloat(txtweight.getText().toString());

                float meter=h/100;

                float ans=w/(meter*meter);

                txtBmi.setText("BMI = "+ans);
            }

        });

    }

}