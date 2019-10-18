package com.example.uts_ppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtn_mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtn_mulai = (Button) findViewById(R.id.btn_masuk);


        mBtn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iLogin = new Intent(getApplicationContext(),Menu.class);
                startActivity(iLogin);
            }
        });
    }
}
