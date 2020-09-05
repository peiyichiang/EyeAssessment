package com.example.android.eyeassessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SurveyActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        button1 = (Button) findViewById(R.id.choice1);
        button2 = (Button) findViewById(R.id.choice2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    
                }
            }
        });
    }

    public void openGridActivity() {
        Intent intent = new Intent(this, GridActivity.class);
        startActivity(intent);
    }
}
