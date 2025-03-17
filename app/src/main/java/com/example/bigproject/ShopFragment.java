package com.example.bigproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ShopFragment extends Fragment {

    private List<ShopItem> shopList;
    private RecyclerView shopRecyclerView;
    private RecyclerViewShopAdapter shopRecyclerViewAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootview = inflater.inflate(R.layout.fragment_shop, container, false);

        shopList = generateShopItems();

        shopRecyclerView = rootview.findViewById(R.id.shopRecyclerView);
        shopRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        shopRecyclerViewAdapter = new RecyclerViewShopAdapter(shopList);
        shopRecyclerView.setAdapter(shopRecyclerViewAdapter);

        return rootview;
    }
    private List<ShopItem> generateShopItems()
    {
        List<ShopItem> shopItems = new ArrayList<>();
        shopItems.add(new ShopItem(R.drawable.rollone,"Сет Осень"));
        shopItems.add(new ShopItem(R.drawable.rolltwo,"Сет Лунный"));
        shopItems.add(new ShopItem(R.drawable.rollthree,"Сет Дерзкий"));

        return shopItems;
    }
}