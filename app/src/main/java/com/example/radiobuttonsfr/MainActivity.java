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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    private Button bttn;
    private TextView tV;
    private Spinner s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing
        s = findViewById(R.id.spinner_id);
        bttn = findViewById(R.id.buttonId);

        // Fills the spinner widget
        CreateSpinner(s);
        // adds an onclick event that displays the text in the textview
        bttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // get the selection from the spinner/dropdown
                String selection =   s.getSelectedItem().toString();

                // Display the result
                tV.setText(selection);

            }
        });


    }
    public void CreateSpinner(Spinner spin) {
        String[] elems = {"Apple", "Banana", "Cherry"};
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, elems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);
        bttn = findViewById(R.id.buttonId);
        tV = findViewById(R.id.resultDisplay);


    }

}