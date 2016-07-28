package com.example.acer.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText address;
    EditText city;
    EditText years;
    EditText birthday;
    Button btn2;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = getIntent().getStringExtra("Name");
        address = (EditText)findViewById(R.id.editText3);
        city  = (EditText)findViewById(R.id.editText4);
        years = (EditText)findViewById(R.id.editText2);
        birthday = (EditText)findViewById(R.id.editText5);
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Main2Activity.this,Main3Activity.class);
                intent2.putExtra("address",address.getText().toString());
                intent2.putExtra("city",city.getText().toString());
                intent2.putExtra("years",years.getText().toString());
                intent2.putExtra("birthday",birthday.getText().toString());
                intent2.putExtra("Name2", name);
                startActivity(intent2);
            }
        });
    }
}
