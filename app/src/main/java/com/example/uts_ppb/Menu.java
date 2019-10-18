package com.example.uts_ppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private Button mBtn_class,commen,number,button,string,Logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mBtn_class = (Button) findViewById(R.id.Class);
        commen = (Button) findViewById(R.id.Commen);
        number = (Button) findViewById(R.id.Number);
        button = (Button) findViewById(R.id.Button);
        string = (Button) findViewById(R.id.String);
        Logout = (Button) findViewById(R.id.Logout);

        mBtn_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iclass = new Intent(getApplicationContext(),Class.class);
                startActivity(iclass);
            }
        });

        commen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent icommen = new Intent(getApplicationContext(),Commen.class);
                startActivity(icommen);
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inumber = new Intent(getApplicationContext(),Number.class);
                startActivity(inumber);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ibutton = new Intent(getApplicationContext(),Buttonn.class);
                startActivity(ibutton);
            }
        });

        string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent istring = new Intent(getApplicationContext(),String.class);
                startActivity(istring);
            }
        });

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent istring = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(istring);
            }
        });
    }
}
