package com.soren.sagen.explicitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText userEditText,passEditText;
    String userValue,passValue;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEditText = findViewById(R.id.username_Et);
        passEditText = findViewById(R.id.password_Et);


    }

    public void SubmitBtn(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        userValue = userEditText.getText().toString();
        passValue =  passEditText.toString();
        intent.putExtra("userValueEt",userValue);
        intent.putExtra("passValueEt",passValue);
        startActivity(intent);
        finish();
    }
}
