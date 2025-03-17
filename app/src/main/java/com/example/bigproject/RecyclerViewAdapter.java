package com.example.bigproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ImageViewHolder> {

    private List<ImageItem> imageList;

    public RecyclerViewAdapter(List<ImageItem> imageList) {
        this.imageList = imageList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ImageViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ImageViewHolder holder, int position) {
        ImageItem imageItem = imageList.get(position);
        holder.imageThumbnail.setImageResource(imageItem.getImageThumbnail());
        holder.textTitel.setText(imageItem.getTextTitel());
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView imageThumbnail;
        TextView textTitel;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            textTitel = itemView.findViewById(R.id.textTitel);
            imageThumbnail = itemView.findViewById(R.id.imageThumbnail);
        }
    }
}
