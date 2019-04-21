package com.gerald.yosua.tugasutsperorangan2025;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.ButterKnife;

public class DetailMusisiActivity extends AppCompatActivity {
    ImageView fotoku;
    TextView nama, detail, detail2, lahir, wafat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_musisi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);

        Musisi diterima = getIntent().getParcelableExtra("kunci");

        fotoku = (ImageView) findViewById(R.id.img_view);
        nama = (TextView) findViewById(R.id.txt_nama);
        detail = (TextView) findViewById(R.id.txt_detail);
        detail2 = (TextView) findViewById(R.id.tv_detail_panjang);
        lahir = (TextView) findViewById(R.id.tv_lahir);
        wafat = (TextView) findViewById(R.id.tv_wafat);

        Glide.with(this).load(diterima.getFoto()).override(350, 550).into(fotoku);

        nama.setText(diterima.getNama());
        detail.setText(diterima.getDetail());
        detail2.setText(diterima.getDetail2());
        lahir.setText(diterima.getLahir());
        wafat.setText(diterima.getWafat());


    }
}