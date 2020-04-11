package com.Avdhio.proyek_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.Avdhio.proyek_uts.Adapter.GameAdapter;
import com.Avdhio.proyek_uts.Model.GameLogo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPc;
    private ArrayList<GameLogo>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, PcActivity.class);
                startActivity(i);
                finish();
            }
        }, 1000);
    }
}
