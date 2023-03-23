package com.example.userdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtUserCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUserCounter = findViewById(R.id.txtUserCounter);
        txtUserCounter.setText("Käyttäjiä on: " + User.userCounter);
    }

    public void switchToActivity(View view) {
        Intent intent = new Intent(this, Activity.class);
        startActivity(intent);
    }

    public void switchToListUsers(View view) {
        Intent intent = new Intent(this, listUsers.class);
        startActivity(intent);
    }

    public void updateUserCounter(View view) {
        txtUserCounter.setText("Käyttäjiä on: " + User.userCounter);
    }

}