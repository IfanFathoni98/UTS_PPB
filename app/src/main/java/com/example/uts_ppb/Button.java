package com.example.uts_ppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
class Buttonn extends AppCompatActivity {
    private android.widget.Button mBtn_kembali,syntax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBtn_kembali = (Button) findViewById(R.id.Kembali);
        syntax= (Button) findViewById(R.id.contoh_Syntax);

        mBtn_kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent isyntax = new Intent(getApplicationContext(),Menu.class);
                startActivity(isyntax);
            }
        });

        syntax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ikembali = new Intent(getApplicationContext(),Syntax_Button.class);
                startActivity(ikembali);
            }
        });
    }
}
