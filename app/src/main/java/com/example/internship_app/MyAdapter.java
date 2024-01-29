package com.example.internship_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.internship_app.MyData;
import com.example.internship_app.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<MyData> data;

    public MyAdapter(List<MyData> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyData item = data.get(position);

        holder.nameTextView.setText(item.getName());
        holder.locationTextView.setText(item.getLocation());
        holder.priceTextView.setText(item.getPrice());
        holder.descriptionTextView.setText(item.getDescription());

        // Load the image using Glide or another image loading library
        Glide.with(holder.itemView.getContext()).load(item.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView nameTextView;
        private TextView locationTextView;
        private ProgressBar progressBar;
        private TextView priceTextView;
        private TextView descriptionTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            locationTextView = itemView.findViewById(R.id.locationTextView);
            progressBar = itemView.findViewById(R.id.progressBar);
            priceTextView = itemView.findViewById(R.id.priceTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
        }
    }
}