package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private String result;
    private String input;
    private EditText countryName;
    private String[] Country = new String[] {"China", "United States", "United Kingdom", "France", "Germany", "Canada", "Russia", "South Korea", "Japan"};
    private String[] Capital = new String[] {"Beijing", "Washington", "London", "Paris", "Berlin", "Ottawa", "Moscow", "Seoul", "Tokyo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countryName = findViewById(R.id.countryName);
        Button Search = findViewById(R.id.search);
        Search.setOnClickListener(this);

    }


    public void onClick(View v) {
        Search();
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
    public void Search() {
        input = countryName.getText().toString();
        for (int i = 0; i < Country.length; i++) {
            if (input.equals(Country[i])) {
                result = Capital[i];
                break;
            }   else {
                result = "Please enter a valid country name.";
            }
        }
    }
}

