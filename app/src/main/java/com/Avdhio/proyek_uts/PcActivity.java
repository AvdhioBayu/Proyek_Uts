package com.Avdhio.proyek_uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.Avdhio.proyek_uts.Adapter.GameAdapter;
import com.Avdhio.proyek_uts.Model.GameLogo;

import java.util.ArrayList;

public class PcActivity extends AppCompatActivity {
    private RecyclerView rvPc;
    private ArrayList<GameLogo>list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc);
        rvPc = findViewById(R.id.rv_pc);
        list.addAll(DataDummy.GetListData());
        rvPc.setLayoutManager(new LinearLayoutManager(this));
        GameAdapter gameAdapter = new GameAdapter(list);
        rvPc.setAdapter(gameAdapter);
    }
}
