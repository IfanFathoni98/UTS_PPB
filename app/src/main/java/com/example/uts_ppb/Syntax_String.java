package com.example.uts_ppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Syntax_String extends AppCompatActivity {
    private Button mbtn_kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syntax__string);
        mbtn_kembali= (Button) findViewById(R.id.kembali_Syntax);

        mbtn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ikembali = new Intent(getApplicationContext(),String.class);
                startActivity(ikembali);
            }
        });
    }
}
