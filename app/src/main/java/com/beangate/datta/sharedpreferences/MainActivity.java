package com.beangate.datta.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText username;
EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
    }
    public void saveData(View view){
        SharedPreferences sharedPreferences=getSharedPreferences("MyData",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("username",username.getText().toString());
        editor.putString("password",password.getText().toString());
        editor.commit();
        Toast.makeText(this,"data was successfully saved",Toast.LENGTH_LONG).show();

    }
    public void next(View view){
        Toast.makeText(this,"Next",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,Activity_B.class);
        startActivity(intent);
    }
}
