package com.example.medha.customtoggle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ToggleButton toggleButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       toggleButton = (ToggleButton)this.findViewById(R.id.toggleButton1);


        toggleButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if(toggleButton.isChecked())
            {
                Toast.makeText(MainActivity.this, "Toggle button is on", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(MainActivity.this, "Toggle button is Off", Toast.LENGTH_LONG).show();
            }
        }

    });
    }
}
