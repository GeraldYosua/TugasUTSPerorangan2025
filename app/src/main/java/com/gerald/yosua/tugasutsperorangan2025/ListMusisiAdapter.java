package com.gerald.yosua.tugasutsperorangan2025;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ListMusisiAdapter extends RecyclerView.Adapter<ListMusisiAdapter.CardViewViewHolder>{
    private Context context;
    private ArrayList<Musisi> listMusisi;
    private OnClick onClick;

    public ListMusisiAdapter(Context context, OnClick onClick) {
        this.context = context;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_musisi, viewGroup, false);
        CardViewViewHolder viewHolder = new CardViewViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        Musisi m = getListMusisi().get(i);
        cardViewViewHolder.tampil(m, onClick);

        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {

            @Override
            public void onItemClicked(View v, int position) {
                Toast.makeText(context, "Share info tentang " + getListMusisi().get(position).getNama(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListMusisi().size();
    }
    public ArrayList<Musisi> getListMusisi() {
        return listMusisi;
    }

    public void setListMusisi(ArrayList<Musisi> listMusisi) {
        this.listMusisi = listMusisi;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgFoto;
        TextView tvNama, tvDetail;
        Button btnShare, btnDetail;
        Musisi musisi;

        public CardViewViewHolder(View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.img_view);
            tvNama = (TextView) itemView.findViewById(R.id.txt_nama);
            tvDetail = (TextView) itemView.findViewById(R.id.txt_detail);
            btnShare = (Button) itemView.findViewById(R.id.btn_share);
            btnDetail = (Button) itemView.findViewById(R.id.btn_detail);
        }
        public void tampil(final Musisi musisi, final OnClick OnItemClick) {

            Glide.with(context)
                    .load(musisi.getFoto())
                    .override(350, 550)

                    .into(imgFoto);

            tvNama.setText(musisi.getNama());
            tvDetail.setText(musisi.getDetail());

            btnDetail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    OnItemClick.onClick(musisi);

                }
            });

        }
    }

    public interface OnClick {
        void onClick(Object musisi);
    }
}