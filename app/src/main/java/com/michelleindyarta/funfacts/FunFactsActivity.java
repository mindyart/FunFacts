package com.michelleindyarta.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    private FactBook mFactbook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    // Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelavtiveLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.FactTextView);
        mShowFactButton = (Button) findViewById(R.id.ShowFactButton);
        mRelavtiveLayout = (RelativeLayout) findViewById(R.id.RelativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactbook.getFact();
                int color = mColorWheel.getColor();

                // Update the screen with our dynamic text
                mFactTextView.setText(fact);
                mRelavtiveLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}
