package com.beangate.datta.sharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_B extends AppCompatActivity {
EditText user;
EditText pass;
public static final String DEFAULT="N/A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__b);
        user=(EditText)findViewById(R.id.userdata);
        pass=(EditText)findViewById(R.id.passwordata);
    }
    public void loadData(View view){
        SharedPreferences sharedPreferences=getSharedPreferences("MyData",MODE_PRIVATE);
        String name=sharedPreferences.getString("username",DEFAULT);
        String password=sharedPreferences.getString("password",DEFAULT);
        if (name.equals(DEFAULT) || password.equals(DEFAULT)){
            Toast.makeText(this,"No value saved",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Data load successfully",Toast.LENGTH_LONG).show();
            user.setText(name);
            pass.setText(password);
        }

    }
}
