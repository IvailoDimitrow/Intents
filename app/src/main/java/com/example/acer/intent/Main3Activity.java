package com.example.acer.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView address,name,city,years,birthday;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // !! getText() oprawi textview2!!!
        address = (TextView)findViewById(R.id.textView2);
        name = (TextView)findViewById(R.id.textView3);
        city = (TextView)findViewById(R.id.textView4);
        years = (TextView)findViewById(R.id.textView5);
        birthday = (TextView)findViewById(R.id.textView6);
        String name2 = getIntent().getStringExtra("Name2");
        String addresss = getIntent().getStringExtra("address");
        String city2 = getIntent().getStringExtra("city");
        String years2 = getIntent().getStringExtra("birthday");
        String birthday2 = getIntent().getStringExtra("years");
        address.setText(addresss);
        name.setText(name2);
        city.setText(city2);
        years.setText(years2);
        birthday.setText(birthday2);
        btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String map = "http://maps.google.co.in/maps?q=" + city.getText().toString() + " " + address.getText().toString(); ;
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(map));
                startActivity(intent);
            }
        });
    }
}
