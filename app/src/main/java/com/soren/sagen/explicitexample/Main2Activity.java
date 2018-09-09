package com.soren.sagen.explicitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.lang.String;

public class Main2Activity extends AppCompatActivity {


    TextView userTv,passTv;
    String valueUsername,valuePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        userTv = findViewById(R.id.userTv);
        passTv = findViewById(R.id.passTv);


        valueUsername = getIntent().getExtras().getString("userValueEt");
        valuePassword = getIntent().getExtras().getString("passValueEt");
        userTv.setText(valueUsername);
        passTv.setText(valuePassword);

    }

}
