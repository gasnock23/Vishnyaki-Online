package com.example.bigproject;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerViewShopAdapter extends RecyclerView.Adapter<RecyclerViewShopAdapter.ShopViewHolder> {

    private List<ShopItem> shopList;

    public RecyclerViewShopAdapter(List<ShopItem> shopList) {
        this.shopList = shopList;
    }

    @NonNull
    @Override
    public RecyclerViewShopAdapter.ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_shop, parent, false);
        return new ShopViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewShopAdapter.ShopViewHolder holder, int position) {
        ShopItem shopItem = shopList.get(position);
        holder.buttonofproduct.setImageResource(shopItem.getButtonofproduct());
        holder.textshop.setText(shopItem.getTextshop());
        holder.textshopbuy.setText(shopItem.getTextshopbuy());
    }

    @Override
    public int getItemCount() {
        return shopList.size();
    }

    public static class ShopViewHolder extends RecyclerView.ViewHolder {
        ImageView buttonofproduct;
        TextView textshop;
        TextView textshopbuy;

        @SuppressLint("WrongViewCast")
        public ShopViewHolder(View itemView) {
            super(itemView);
            buttonofproduct = itemView.findViewById(R.id.buttonofproduct);
            textshop = itemView.findViewById(R.id.textshop);
            textshopbuy = itemView.findViewById(R.id.textshopbuy);
        }
    }

}
