package com.example.tiktaktoe_dheeraj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class StartingActivity extends AppCompatActivity {
    Button getStartedBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
        getStartedBtn=(Button)findViewById(R.id.GetStartedBtn);
        getStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new
                        Intent(getApplicationContext(),UserActivity.class);
                startActivity(intent);
            }
        });
    }
}

