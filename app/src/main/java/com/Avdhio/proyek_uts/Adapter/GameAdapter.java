package com.Avdhio.proyek_uts.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Avdhio.proyek_uts.Model.GameLogo;
import com.Avdhio.proyek_uts.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder>  {
    private ArrayList<GameLogo> listGame;
    private OnitemListener listener;


    public GameAdapter(ArrayList<GameLogo> list,OnitemListener listener) {
        this.listGame = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_logo,parent,false);
        return new ViewHolder(view);
    }
    public interface OnitemListener{
        void onListClicked(int index, GameLogo item);
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.ViewHolder holder, int position) {
    GameLogo item = listGame.get(position);
    holder.bind(position, item);

    Glide.with(holder.itemView.getContext())
            .load(GameLogo.getLogogame())
            .apply(new RequestOptions().override(350, 55))
            .into(holder.gambar);

    holder.nama.setText(item.getName());
    }

    @Override
    public int getItemCount() {

        return listGame.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambar;
        public TextView nama;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.image_logo);
            nama = itemView.findViewById(R.id.text_name);
        }


        public void bind(final int index, final GameLogo item){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onListClicked(index,item);
                }
            });
        }
    }
}
