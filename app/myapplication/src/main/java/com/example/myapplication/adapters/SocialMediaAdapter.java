package com.example.myapplication.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.models.SocialMediaModel;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaAdapter extends RecyclerView.Adapter<SocialMediaAdapter.ViewHolder> {
    ArrayList<SocialMediaModel> arrayList;
    Activity activity;

    public SocialMediaAdapter(ArrayList<SocialMediaModel> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public SocialMediaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.socialmediaitem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SocialMediaAdapter.ViewHolder holder, int position) {
        SocialMediaModel item = arrayList.get(position);
        
        holder.numText.setText(String.valueOf(item.getId()));
        holder.image.setImageResource(item.getImage());
        holder.gameText.setText(item.getGame());
        holder.categoryText.setText(item.getCategory());
        holder.ratingText.setText(String.valueOf(item.getRating()));
        holder.ratingBar.setRating(item.getRating());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView numText;
        ImageView image;
        TextView gameText;
        TextView categoryText;
        TextView ratingText;
        RatingBar ratingBar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            numText = itemView.findViewById(R.id.num_sm);
            image = itemView.findViewById(R.id.img_sm);
            gameText = itemView.findViewById(R.id.game_sm);
            categoryText = itemView.findViewById(R.id.name1_sm);
            ratingText = itemView.findViewById(R.id.t_sm);
            ratingBar = itemView.findViewById(R.id.rating_bar_sm);
        }
    }
}
