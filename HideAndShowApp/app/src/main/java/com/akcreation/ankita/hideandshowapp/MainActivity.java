package com.akcreation.ankita.hideandshowapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
    TextView img;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (TextView) findViewById(R.id.textview);
        button = (Button) findViewById(R.id.button);
    }

    public void onClick(View v){

        boolean hide = ((ToggleButton) v).isChecked();
        if(hide)
        {
            img.setVisibility(View.GONE);
            button.setText("Show");
        }
        else{
            img.setVisibility(View.VISIBLE);
            button.setText("Hide");
        }
    }
}
