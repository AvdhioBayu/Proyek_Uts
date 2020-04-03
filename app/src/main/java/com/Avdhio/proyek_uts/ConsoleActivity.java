package com.Avdhio.proyek_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.Avdhio.proyek_uts.Adapter.GameAdapter;
import com.Avdhio.proyek_uts.Model.GameLogo;

import java.util.ArrayList;

public class ConsoleActivity extends AppCompatActivity {
    private RecyclerView rvConsole;
    private ArrayList<GameLogo>list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_console);
        rvConsole = findViewById(R.id.rv_pc);
        list.addAll(DataDummy.GetListData());
        rvConsole.setLayoutManager(new LinearLayoutManager(this));
        GameAdapter gameAdapter = new GameAdapter(list);
        rvConsole.setAdapter(gameAdapter);
    }
}
