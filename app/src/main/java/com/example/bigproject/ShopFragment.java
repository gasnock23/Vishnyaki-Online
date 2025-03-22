package com.example.bigproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ShopFragment extends Fragment {

    public static class Product {
        private final String name;
        private final String price;
        private final String imageUrl;

        // Конструктор с тремя параметрами
        public Product(String name, String price, String imageUrl) {
            this.name = name;
            this.price = price;
            this.imageUrl = imageUrl;
        }

        // Геттеры для всех полей
        public String getName() { return name; }
        public String getPrice() { return price; }
        public String getImageUrl() { return imageUrl; }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shop, container, false);


        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));


        // Создание списка товаров
        List<Product> products = new ArrayList<>();
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));
        products.add(new Product("Ноубук","999$","https://m.media-amazon.com/images/I/81J19rmMArL._AC_SL1500_.jpg"));


        // Инициализация адаптера
        ProductAdapter adapter = new ProductAdapter(products);
        recyclerView.addItemDecoration(new ItemDecoration(8));
        recyclerView.setAdapter(adapter);

        return view;
    }

}