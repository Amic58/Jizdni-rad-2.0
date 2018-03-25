package com.example.android.restop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView modrany = (TextView) findViewById(R.id.modrany);

        modrany.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent modranyIntent = new Intent(MainActivity.this, ModranyActivity.class);

                startActivity(modranyIntent);
            }
        });

        TextView podbaba = (TextView) findViewById(R.id.podbaba);

        podbaba.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent podbabaIntent = new Intent(MainActivity.this, PodbabaActivity.class);

                startActivity(podbabaIntent);
            }
        });

        TextView branik = (TextView) findViewById(R.id.branik);

        branik.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent branikIntent = new Intent(MainActivity.this, BranikActivity.class);

                startActivity(branikIntent);
            }
        });

    }
}
