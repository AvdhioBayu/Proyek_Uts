package com.Avdhio.proyek_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void GamePC(View view) {
        Intent intent = new Intent(this, PcActivity.class);
        startActivity(intent);
    }

    public void GameConsole(View view) {
        Intent intent = new Intent(this, ConsoleActivity.class);
        startActivity(intent);
    }

    public void GameMobile(View view) {
        Intent intent = new Intent(this, MobileActivity.class);
        startActivity(intent);
    }
}
