package com.example.radiobuttonsfr;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    private Button bttn;
    private EditText eT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner_id);
        CreateSpinner(spinner);


    }
    public void CreateSpinner(Spinner spin) {
        String[] elems = {"Apple", "Banana", "Cantaloupe"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, elems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        bttn = findViewById(R.id.buttonId);
        eT = findViewById(R.id.)

    }
    public void onClick(View view) {
        String numberOneText = numberOneEditText.getText().toString();
        String numberTwoText = numberTwoEditText.getText().toString();

        try {

            String selection = spinner.getSelectedItem().toString();

            // Display the result
            resultView.setText(toDisplay);
        } catch (Exception e) {
            // When input isn't valid
            resultView.setText("Invalid input");
        }
        MediaPlayer mp =MediaPlayer.create(MainActivity.this,R.raw.impact6291);
        mp.start();
    }
}