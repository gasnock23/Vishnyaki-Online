package com.example.bigproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;

    private LayoutInflater layoutInflater;

    private Integer[] image = {R.drawable.roll4, R.drawable.roll5, R.drawable.roll6};

    public ViewPagerAdapter(HomeFragment context)
    {
        this.context = context.getContext();
    }

    @Override
    public int getCount()
    {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object)
    {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position)
    {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.layoutimageviewpager, null);

        ImageView imageView = view.findViewById(R.id.imageViewPager);
        imageView.setImageResource(image[position]);

        ViewPager viewPager = (ViewPager)container;
        viewPager.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object)
    {
        ViewPager viewPager = (ViewPager)container;
        View view = (View)object;

        viewPager.removeView(view);
    }
}
