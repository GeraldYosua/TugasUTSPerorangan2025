package com.gerald.yosua.tugasutsperorangan2025;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Musisi> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        recyclerView = (RecyclerView) findViewById(R.id.rv_category);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(MusisiData.getListDAta());

        showRecyclerList();
    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListMusisiAdapter listMusisiAdapter = new ListMusisiAdapter(this, new ListMusisiAdapter.OnClick() {
            @Override
            public void onClick(Object musisi) {
                Musisi musisi1 = (Musisi) musisi;
                Intent intent = new Intent(MainActivity.this, DetailMusisiActivity.class);
                intent.putExtra("kunci", musisi1);
                startActivity(intent);
            }
        });

        listMusisiAdapter.setListMusisi(list);
        recyclerView.setAdapter(listMusisiAdapter);
    }
}
