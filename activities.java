package com.example.predict2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class activities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities);

        // Find views
        Button teachersSurveyButton = findViewById(R.id.teachersSurveyButton);
        Button studentsSurveyButton = findViewById(R.id.studentsSurveyButton);
        Button parentsSurveyButton = findViewById(R.id.parentsSurveyButton);
        Button postTutorialsButton = findViewById(R.id.postTutorialsButton);
        Button generateReportsButton = findViewById(R.id.generateReportsButton);
        Button createUserButton = findViewById(R.id.createUserButton);
        Button deleteUserButton = findViewById(R.id.deleteUserButton);
        Button addCourseButton = findViewById(R.id.addCourseButton);
        Button deleteCourseButton = findViewById(R.id.deleteCourseButton);

        // Set click listeners
        teachersSurveyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Teachers Survey Activity
                Intent intent = new Intent(activities.this, tsurvey.class);
                startActivity(intent);
            }
        });

        studentsSurveyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Students Survey Activity
                Intent intent = new Intent(activities.this, ssurvey.class);
                startActivity(intent);
            }
        });
        generateReportsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Generate Reports Activity
                Intent intent = new Intent(activities.this, generate.class);
                startActivity(intent);
            }
        });


        parentsSurveyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Parents Survey Activity
                Intent intent = new Intent(activities.this, psurvey.class);
                startActivity(intent);
            }
        });

        // Implement click listeners for other buttons if needed
    }
}
