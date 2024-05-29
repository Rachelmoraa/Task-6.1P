package com.example.personalizedlearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InterestSelectionActivity extends AppCompatActivity {

    private Button[] interestButtons;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest_selection);

        TextView textViewTitle = findViewById(R.id.textViewTitle);
        TextView textViewDescription = findViewById(R.id.textViewDescription);

        // Set the text for the title and description
        textViewTitle.setText("Your Interests");
        textViewDescription.setText("You can pick up to 10");

        // Initialize the interest buttons
        interestButtons = new Button[4]; // Adjust the size as needed
        interestButtons[0] = findViewById(R.id.buttonAlgorithm);
        interestButtons[1] = findViewById(R.id.buttonDataStructures);
        interestButtons[2] = findViewById(R.id.buttonWebDevelopment);
        interestButtons[3] = findViewById(R.id.buttonTesting);

        // Set click listeners for interest buttons
        for (Button button : interestButtons) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println("ADDED SUCCESSFULLY");
                }
            });
        }

        // Initialize and set click listener for the Next button
        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("ADDED SUCCESSFULLY");
            }
        });
    }
}
