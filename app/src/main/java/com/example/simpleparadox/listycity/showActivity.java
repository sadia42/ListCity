package com.example.simpleparadox.listycity;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.appcompat.app.AppCompatActivity;

public class showActivity extends AppCompatActivity {
    TextView textview,printroll;
    Button buttons;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
        textview= findViewById(R.id.cityname);
        buttons= findViewById(R.id.backbutton);
        printroll = findViewById(R.id.myname);
        printroll.setText("Roll: 1707042");
        Bundle extra = getIntent().getExtras();
        if(extra!=null)
        {
            textview.setText(extra.getString("cityname"));
        }
        buttons.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){ showActivity.this.finish(); }

        });

    }
}
