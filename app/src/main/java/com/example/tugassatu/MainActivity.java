package com.example.tugassatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int naik = 50;
    Button toast, CountUp, CountDown;
    TextView _txtlimapuluh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast = (Button) findViewById(R.id.button);
        CountUp = (Button) findViewById(R.id.button2);
        CountDown = (Button) findViewById(R.id.button3);
        _txtlimapuluh = (TextView) findViewById(R.id.limapuluh);

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Jandy", Toast.LENGTH_SHORT).show();
            }
        });

        CountUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik++;
                _txtlimapuluh.setText(Integer.toString(naik));
            }
        });

        CountDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                naik--;
                _txtlimapuluh.setText(Integer.toString(naik));

            }
        });
    }
}
