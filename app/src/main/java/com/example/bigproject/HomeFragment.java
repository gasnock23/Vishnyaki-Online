package com.example.bigproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment{

    private List<ImageItem> imageList;
    private RecyclerView homeRecyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    ViewPager viewPager;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        viewPager = (ViewPager)view.findViewById(R.id.pager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(HomeFragment.this);
        viewPager.setAdapter(viewPagerAdapter);


        imageList = generateImageItems();

        homeRecyclerView = view.findViewById(R.id.homeRecyclerView);
        homeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerViewAdapter = new RecyclerViewAdapter(imageList);
        homeRecyclerView.setAdapter(recyclerViewAdapter);

        return view;
    }

    private List<ImageItem> generateImageItems()
    {
        List<ImageItem> imageItems = new ArrayList<>();
        imageItems.add(new ImageItem(R.drawable.rollone,"Сет Осень"));
        imageItems.add(new ImageItem(R.drawable.rolltwo,"Сет Лунный"));
        imageItems.add(new ImageItem(R.drawable.rollthree,"Сет Дерзкий"));

        return imageItems;
    }
}