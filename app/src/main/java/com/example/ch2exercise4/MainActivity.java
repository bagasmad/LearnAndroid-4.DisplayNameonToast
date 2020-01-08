package com.example.ch2exercise4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction(View view)
    {
        EditText userName = findViewById(R.id.editTextUsername);
        Toast.makeText(this, "Hello " + userName.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
