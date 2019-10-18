package com.example.uts_ppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class String extends AppCompatActivity {
    private Button mbtn_syntax, mbtn_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
        mbtn_syntax = (Button) findViewById(R.id.contoh_Syntax);
        mbtn_kembali= (Button) findViewById(R.id.Kembali);

        mbtn_syntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent isyntax = new Intent(getApplicationContext(),Syntax_String.class);
                startActivity(isyntax);
            }
        });

        mbtn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ikembali = new Intent(getApplicationContext(),Menu.class);
                startActivity(ikembali);
            }
        });
    }
}
