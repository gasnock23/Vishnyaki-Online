package com.example.bigproject;

import android.widget.ImageButton;
import android.widget.ImageView;

public class ShopItem {

    private int buttonofproduct;
    private String textshop;

    public ShopItem(int rollone, String сетОсень) {
    }


    public int getButtonofproduct() {
        return buttonofproduct;
    }

    public String getTextshop() {
        return textshop;
    }

    public String getTextshopbuy() {
        return textshopbuy;
    }

    private String textshopbuy;

    public ShopItem(int buttonofproduct, String textshop, String textshopbuy) {
        this.buttonofproduct = buttonofproduct;
        this.textshop = textshop;
        this.textshopbuy = textshopbuy;
    }
}
